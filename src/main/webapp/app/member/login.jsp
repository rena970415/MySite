<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/login.css">
<title>회원가입</title>
</head>
 <body>
 	<c:if test="${not empty param.code}">
 		<script>
 			alert("아이디 or 비밀번호를 다시 확인해주세요.");
 		</script>
 	</c:if>
 
        <div class="wrap">
            <div class="form-wrap">
                <div class="button-wrap">
                    <div id="btn"></div>              
                    <button type="button" class="togglebtn" >Log IN</button>
                </div>
                
                <div class="social-icons">
                    <img src="${pageContext.request.contextPath}/assets/css/img/fb.png" alt="facebook">
                    <img src="${pageContext.request.contextPath}/assets/css/img/tw.png" alt="twitter">
                    <img src="${pageContext.request.contextPath}/assets/css/img/gl.png" alt="google">
                </div>
                
                
               	<span id="idCheck_text"style="font-size:0.7em"></span><br/>
                <form id="login" method="post"  action="${pageContext.request.contextPath}/member/MemberLoginOk.me" name="loginForm" class="input-group">
                    <input type="text"  name="memberId" id="memberId" class="input-field" placeholder="User ID" required>
                    <input type="password"  name="memberPw" id="memberPw" class="input-field" placeholder="Enter Password" required>
                   
                    <input type="checkbox" class="checkbox"><span>Terms and conditions</span>
                    <input type="button" value="login" class="primary submit" onclick="check()">
                </form>
            </div>
        </div>      
</body>
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/util.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
<script>var contextPath = "${pageContext.request.contextPath}"</script>
<script src="${pageContext.request.contextPath}/app/member/login.js"></script>
<script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>
</html>

