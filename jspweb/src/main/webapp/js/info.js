
function passwordcheck(mid){
	//* jquery 식
	let mpassword = $("#mpassword").val();
	// * js 식
	//let mpassword = document.getElementById("mpassword").value;
	
	//비동기 통신 = 제이쿼리 제공해주는 통신 메소드
		//[js(view)---> java(controller)]
	//$.ajax({속성명=속성값,속성명2 =속성값2});
	$.ajax({
		url : "../passwordcheck",//어디로
		data : {"mid" : mid , "mpassword" : mpassword},// 보낼 데이터
		type : "post", // HTTP 요청방식 정의[GET=기본값, POST]
		success : function(result){ //받을 데이터
		console.log(result);
			if(result ==1){
				$("#checkmsg").html("정말 탈퇴하시겠습니까?");
				$("#mpassword").css("display","none");
				$("#btndelete").css("display","block");
				$("#btnconfirm").css("display","none");
			}else{
				$("#checkmsg").html("동일한 패스워드가 아닙니다.");
				$("#mpassword").val("");
			}
		}
	});
}

function mdelete(mid){
	$.ajax({
		url : "../delete",
		data : {"mid" : mid}, 
		success : function(result){
			if(result ==1){
				alert("회원탈퇴 완료 되었습니다.")
				// js에서 하이퍼링크 [ 페이지연결 ]
				// <a href="경로">
				// location.href="경로">
				location.href="/jspweb/logout";
			}else{
				location.href="/jspweb/error.jsp";
			}
		}
	});
}