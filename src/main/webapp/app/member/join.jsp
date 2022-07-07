<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/join.css">
<title>회원가입</title>
</head>
 <body>
        <div class="wrap">
            <div class="form-wrap">
                <div class="button-wrap">
                    <div id="btn"></div>              
                    <button type="button" class="toggleb'tn" >REGISTER</button>
                </div>
                
                <div class="social-icons">
                    <img src="${pageContext.request.contextPath}/assets/css/img/fb.png" alt="facebook">
                    <img src="${pageContext.request.contextPath}/assets/css/img/tw.png" alt="twitter">
                    <img src="${pageContext.request.contextPath}/assets/css/img/gl.png" alt="google">
                </div>
                
                
               	<span id="idCheck_text"style="font-size:0.7em"></span><br/>
                <form id="register" method="post"  action="${pageContext.request.contextPath}/member/MemberJoinOk.me" name="joinForm" class="input-group">
                    <input type="text"  name="memberId" id="memberId" class="input-field" placeholder="User ID" required>
                    <input type="password"  name="memberPw" id="memberPw" class="input-field" placeholder="Enter Password" required>
                    <input type="text" name="memberName" id="memberName" class="input-field" placeholder="Your Name" required>
                    <input type="text" name="memberAge" id="memberAge" class="input-field" placeholder="Your Age" required>
                    <input type="text" class="input-field" name="memberGender" id="memberGender" placeholder="Your Gender" required>
                    <input type="text" class="input-field" name="memberEmail" id="memberEmail" placeholder="Your Email" required>
                    <input type="checkbox" class="checkbox"><span>Terms and conditions</span>
                    <input type="button" value="register" class="primary submit" onclick="formSubmit()">
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
<script src="${pageContext.request.contextPath}/app/member/join.js"></script>
<script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>
</html>

