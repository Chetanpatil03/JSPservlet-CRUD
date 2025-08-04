<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home | CRUD</title>
<link rel="stylesheet" type="text/css" href="style.css">
 
<script type="text/javascript">
	function confirmDelete(){
		if(confirm("Are you sure you want to delete your Account")){
			window.location.href = "DeleteServlet";
		}
	}
</script>
 <!-- If you are using the post method. 
 
 <script>
    function confirmDelete() {
        if (confirm("Are you sure you want to delete your account?")) {
            document.getElementById("deleteForm").submit();
        }
    }
</script>
-->
 


</head>
<body>
<%
    HttpSession session1 = request.getSession(false);
    if (session1 != null && session1.getAttribute("username") != null) {
        String username = (String) session1.getAttribute("username");

        // Get messages from query parameters
        String updateStatus = request.getParameter("update");
        String error = request.getParameter("error");
%>
	<div class=container>
		<h1>Welcome, <%=username %>! 👋</h1>

		<p>Hey Chetan! We're excited to have you here.</p>
		<p>You're doing a great job building this project — one step closer to mastering backend development. 💪</p>
		<p>Keep exploring, learning, and coding your way forward. 🚀</p>
		<p>Whenever you're ready, you can securely LOGOUT and return anytime. 🔐</p>
		<div class="links">
			<a href="logout">LOGOUT</a> | <a href="update.jsp">UPDATE</a> | <a href="javascript:void(0);" onclick = "confirmDelete()">DELETE</a>
		</div>
		
		<!-- Display success/error messages -->
	<%
        if ("success".equals(updateStatus)) {
    %>
        <p style="color:green;">Update successful!</p>
    <%
        } else if ("1".equals(error)) {
    %>
        <p style="color:red;">Update failed. Please try again.</p>
    <%
        } else if ("2".equals(error)) {
    %>
        <p style="color:red;">Account deletion failed. Please try again.</p>
    <%
        }
    %>
		
	</div>
<%
    } else {
        // If session is invalid, redirect to login
        response.sendRedirect("login.jsp");
    }
%>
</body>
</html>

<!-- this page have validation like you can not access this page without the login -->
<!-- When you login session is automatically created and you get the access -->