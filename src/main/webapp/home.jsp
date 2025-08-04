<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home | CRUD</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<%
	HttpSession session1 = request.getSession(false);
	if(session1 != null && session1.getAttribute("username") != null){
		String username = (String) session1.getAttribute("username");
%>
	<div class=container>
		<h1>Welcome, <%=username %>! 👋</h1>

		<p>Hey Chetan! We're excited to have you here.</p>
		<p>You're doing a great job building this project — one step closer to mastering backend development. 💪</p>
		<p>Keep exploring, learning, and coding your way forward. 🚀</p>
		<p>Whenever you're ready, you can securely LOGOUT and return anytime. 🔐</p>
		<div class="links">
			<a href="logout">LOGOUT</a> | <a href="update.jsp">UPDATE</a> | <a href="DeleteServlet">DELETE</a>
		</div>
	</div>
<%
		}
		else{
			response.sendRedirect("login.jsp");
		}
%>
</body>
</html>