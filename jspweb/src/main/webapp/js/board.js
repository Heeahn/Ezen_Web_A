
// 문서 열렸을 때 실행
$(document).ready(function(){
	$('#summernote').summernote({
        placeholder: '내용 입력',
        tabsize: 2,
        minHeight: 300,
        maxHeight: null,
        lang : 'ko-KR'
      });
});

function filedelete(bno){

	// HTML에서 JS로 변수 이동
		//1. 메소드 인수로 이동
		// 2. 태그의 value 혹은 html 이동
	// 비동기 통신 = 페이지 전환이 없는 상태 DB통신
	// JQUERY라이브러리의 AJAX 사용
	$.ajax({
		url : "filedelete", // 서블릿 통신
		data : {"bno" : bno}, // 통신 데이터 : {변수명1:값, 변수명2:값, ...}
		success : function(result){
			if(result==1){
				alert("첨부 파일 삭제 성공");
				location.reload(); // 현재 페이지 새로고침
			}else{
				alert("첨부 파일 삭제 실패[관리자에게 문의]");
			}
		}
	});
}

function replywrite(bno){
	
	let rcontent = $("#rcontent").val();

	$.ajax({
		url : "replywrite",
		data : {"bno": bno , "rcontent": rcontent},
		success : function(rs){
			if(rs==1){
				alert("댓글작성 되었습니다. ");
				$("#rcontent").val(""); // 작성 input 공백으로 초기화
				$("#replytable").load( location.href+" #replytable");
			}else{
				alert("댓글작성이 실패했습니다.");
			}
		}
	});
}

function rereplyview(rno, bno, mid){
	if(mid == "null"){
		alert("로그인 후 작성이 가능합니다."); return;
	}
	
	$("#"+rno).html(
		'<div class="row">'+
			'<div class="col-md-10">'+
				'<textarea id="rrcontent"class="form-control" rows="3"></textarea>'+
			'</div>'+
			'<div class="col-md-2">'+
				'<button class="form-control py-4 my-1" onclick="rereplywrite('+rno+','+bno+')">대댓글 등록</button>'+
			'</div>'+
		'</div>'
	);
}
function rereplywrite(rno,bno){
	let rrcontent = $("#rrcontent").val();
	
	$.ajax({
		url : "rereplywrite",
		data : {"rno":rno, "bno":bno,"rrcontent":rrcontent},
		success : function(rs){
			if( rs == 1 ){
				 alert("대댓글 작성 되었습니다."); // 성공 메시지 알림 
				 $("#rrcontent").val(""); // 작성 input 공백으로 초기화 
				 $("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
			}
			else{ alert("대댓글작성이 실패했습니다."); }
		}
	});
}

function replydelete(rno){
	$.ajax({
		url : "replydelete",
		data : {"rno" : rno},
		success : function(rs){
			if(rs==1){
				alert("댓글 삭제 되었습니다.");
				$("#replytable").load(location.href+" #replytable");
			}else{
				alert("삭제 실패[관리자에게 문의]");
			}
		}
		
	});
}


function replyupdate(rno){
	
	let rcontent = $("#rcontent").val();
	
	$.ajax({
		url : "replyupdate",
		data : {"rno":rno, "rcontent":rcontent},
		success : function(rs){
			if( rs == 1 ){
				 alert("댓글 수정 되었습니다."); // 성공 메시지 알림 
				 $("#rcontent").val(""); // 작성 input 공백으로 초기화 
				 $("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
			}
			else{ alert("댓글작성이 실패했습니다."); }
		}
	});
}

















