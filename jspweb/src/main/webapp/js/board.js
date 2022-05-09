
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
		url : "../filedelete", // 서블릿 통신
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
