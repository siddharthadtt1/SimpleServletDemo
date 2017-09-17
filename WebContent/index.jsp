<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h3>Hi ${user} ! Welcome to the index page</h3>
	<form action="/SimpleServletDemo/SimpleServlet" method="post">
		<table>
			<tr>
				<td><label id="nameId">Name :</label><input type="text"
					id="nameId" name="name" /></td>
			</tr>
			<tr>
				<td><label id="ageId">Age :</label><input type="text"
					id="ageId" name="age" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>