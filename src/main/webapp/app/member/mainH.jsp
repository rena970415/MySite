<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/mainH.css">
<title>메인</title>
</head>

<body>
	 
    <div class="container" id="header">
        <a href="#">Detml</a>
        <ul>
            <li><a href="#">About</a></li>
            <li><a href="join.jsp">Join</a></li>
            <li><a href="boardList.jsp">Board</a></li>
            <li><a href="#">Find</a></li>
            <li><a href="login.jsp">Login</a></li>
        </ul>
    </div>
  
    <div id="main">
        <div class="container mtb">
            <p>
                Lorem Ipsum is simply dummy text of the printing and typesetting industry.<br/>
                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,<br/>
                when an unknown printer took a galley of type and scrambled it to make a type specimen book.
            </p>
        </div>
        <div class="bg"></div>
    </div>

    <div id="info">
        <div class="container">
            <p>
                Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC,
                making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the
                more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature,
                discovered the undoubtable source.<br/><br/><br/>

                Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The Extremes of Good and Evil) by Cicero, written in 45 BC.
                This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, "Lorem ipsum dolor sit amet..", comes from
                a line in section 1.10.32.
            </p>
            <p>
                Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum'
                will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).
            </p>
        </div>
    </div>
    
</body>
</html>