<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header id="header">
	<a href="Main1.jsp" class="logo">감정 쓰레기통 <span>당신의 감정을 공유해주세요.</span></a>
	<nav>
		<ul>
			<li><a href="#menu">Menu</a></li>
		</ul>	
	</nav>
</header>

<nav id="menu">
	<ul class="actions stacked">
		<li>
			<a href="${pageContext.request.contextPath}/member/MemberJoin.me">회원가입</a>
		</li>
		<c:choose>
		<c:when test="${sessionId eq null}">
			<li>
				<a href="${pageContext.request.contextPath}/member/MemberLogin.me">로그인</a>
			</li>
		</c:when>
		<c:otherwise>
			<li>
				<a href="${pageContext.request.contextPath}/member/MemberLogoutOk.me">로그아웃</a>
			</li>
		</c:otherwise>
		</c:choose>
		<li>
			<a href="${pageContext.request.contextPath}/board/BoardListOk.bo">게시판</a>
		</li>
	</ul>
</nav>