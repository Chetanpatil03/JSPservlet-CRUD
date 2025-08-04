<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update | CRUD</title>
<link rel="stylesheet" type="text/css" href="login.css">

<script type="text/javascript">
        function confirmUpdate() {
            // Get form field values
            var email = document.getElementById("email").value;
            var password = document.getElementById("password").value;

            // Build the confirmation message
            var message = "Please confirm the following changes:\n\n" +
                          "Email: " + email + "\n" +
                          "Password: " + password + "\n\n" +
                          "Do you want to proceed?";

            // Show confirmation dialog
            return confirm(message);
        }
    </script>

</head>
<body>
<%
	
	String username = (String)session.getAttribute("username");
%>
<div class="container">
	<h1>Register</h1>
		<form action="UpdateServlet" method="post" onsubmit="return confirmUpdate();">
			<label for="username">Username:</label> 
				<input type="text" id="username" name="username" value = <%=username %> readonly><br> 
			<label for="email">Email:</label> 
				<input type="text" id="email" name="email" required><br>
			<label for="password">Password:</label> 
				<input type="password" id="password" name="password" required><br>
			<input class="Button" type="submit" value = "Update"/>
		</form>
		<p><a href ="home.jsp" >Back to Home</a></p>
		
	</div>

</body>
</html>