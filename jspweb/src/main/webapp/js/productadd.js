$(function a(){
	getcategory();
})

function categorybtn(){
	$("#categoryinput").html(
		'<input type="text" id="cname">'+
		'<button onclick="categoryadd()" type="button">등록</button>'
	)
}

function categoryadd(){
	
	let cname = $("#cname").val();
	
	$.ajax({
		url : "categoryadd",
		data : {"cname":cname},
		success : function(rs){
			if(rs==1){
				alert("카테고리 등록성공");
				getcategory();
			}else{ alert("카테고리 등록 실패");}
		}
	});
}

function getcategory(){
	$.ajax({
		url : "getcategory",
		success : function(rs){
			$("#categorybox").html(rs);
		}
	});
};

function productadd(){
	
	var form = $("#addform")[0]; // 폼 태그 id 호출 [0] 인덱스 호출 
	var formData = new FormData( form ); // js 지원하는 FormData 클래스를 이용한 form태그 객체화
	// ajax 기본적으로 문자열 전송한다.  인코딩 URL 타입 : application/x-www-form-urlencoded
	$.ajax({
		url : "productadd",
		type : 'POST' , /* type : 1.GET(기본타입) 2.POST(첨부파일사용시,보안용 등)*/
		data : formData , 		/* form 객체를 전송 */
		contentType : false ,  /* 전송시 문자열 타입X *
		/* contentType 전송시 내용물 URL 타입 //  String방식 : https://finance.naver.com/item/main.naver?code=005930 */
		/* contentType : true : URL 인코딩 타입 문자열 O [ 기본타입 ]
		/* contentType : false : URL 인코딩 타입 문자열 X */ 
		processData : false ,  /* 전송시 문자열 전송X */
		/*  html 에서 enctype="multipart/form-data"  */
		/*  ajax 에서 contentType : false, processData : false */
		success : function( re ){
			if( re == 1){
				alert(" 등록이 되었습니다. "); 
				form.reset(); 	/* form안에 적혀있는 내용 지우기 */
			}else{
				alert(" 등록이 실패 했습니다 [ 관리자에게 문의 ] ");
			}
		}
	});
}
/* -------- --------------------------- */