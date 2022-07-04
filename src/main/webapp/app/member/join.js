

var check = false;

function formSubmit(){
	var form = document.joinForm;
	
	if(!form.memberId.value){
		alert("아이디를 확인해주세요.");
		return;
	}
	
	form.submit();
	
}

function checkId(id){
	check = false;
	
	if(id == ""){
		$("#idCheck_text").text("");
		return;
	}
	// 제이쿼리 에이젝스
	$.ajax({
		// 자바 스크립에서는 el문 불가, 그래서 join.jsp에서 변수 선언후 경로를 만듬
		url:contextPath + "/member/MemberCheckIdOk.me?memberId=" + id,
		type:"get",
		dataType:"json",
		success:function(result){
			if(result.status == 'ok'){
				$("#idCheck_text").text("사용 가능");
				$("#idCheck_text").css("color", "blue");
				check = true;
			}else{
				$("#idCheck_text").text("사용 불가");
				$("#idCheck_text").css("color", "red");
			}
		},
		error:function(){
			console.log("오류");
		}
	});
}

$("input[name='memberId']").keyup(function(){
	checkId($(this).val());
})












