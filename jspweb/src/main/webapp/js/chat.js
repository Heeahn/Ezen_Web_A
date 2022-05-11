
	var lastID = 0;
	
	function submitFunction(){
		var chatName = $("#chatName").val();
		var chatContent = $("#chatContent").val();
		$.ajax({
			type : "POST",
			url : "./chatSubmitServlet",
			data : {
				chatName: encodeURIComponent(chatName),
				chatContent: encodeURIComponent(chatContent)
			},
			success : function(result){
				if(result == 1){
					autoClosingAlert('#successMessage', 2000);
				}else if(result == 0){
					autoClosingAlert('#dangerMessage', 2000);
				}else{
					autoClosingAlert('#warningMessage', 2000);
				}
			}
		});
		$('#chatContent').val("");
	}
	function autoClosingAlert(selector, delay){
		var alert = $(selector).alert();
		alert.show();
		window.setTimeout(function() {
			alert.hide()
		},delay);
	}
	function chatListFunction(type){
		$.ajax({
			type : "POST",
			url : "./chatListServlet",
			data : {
				listType: type,
			},
			success : function(data){
				if(data == "") return;
				var parsed = JSON.parse(data);
				var result = parsed.result;
				for(var i = 0; i<result.length; i++){
					addChat(result[i][0].value, result[i][1].value, result[i][2].value);
				}
				lastID = Number(parsed.last);
			}
		});
	}	
	function addChat(chatName, chatContent, chatTime){
		$('#chatList').append(
			'<div class="row">' +
				'<div class="col-lg-12">' +
					'<div class="media">' +
						'<a href="#" class="pull-left">' +
							'<img class="media-object img-circle" src="images/icon32.png" />' +
						'</a>' +
						'<div class="media-body">' +
							'<h4 class="media-heading">' +
								chatName + '<span class="small pull-right">' + chatTime + '</span>' +
							'</h4>' +
							'<p>' + chatContent + '</p>' +
						'</div>' +
					'</div>' +
				'</div>' +
			'</div>' + 
			'<hr />'
		);
		$('#chatList').scrollTop($('#chatList')[0].scrollHeight);
	}
	function getInfiniteChat(){
		setInterval(function(){
			chatListFunction(lastID); 
		},1000);
	}
		$(document).ready(function(){
			chatListFunction('ten');
			getInfiniteChat();
		});