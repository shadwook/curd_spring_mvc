<%@page isELIgnored="false" %>
<%@ taglib prefix = "s" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Employe Recordes</h1>
<h3 style="color:green">${success}</h3>
<table border="1">

<tr> 
<th>Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Salary</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<tr>
<s:forEach var="emp"  items="${list}">
<td>${emp.name}</td>
<td>${emp.getEmail()}</td>
<td>${emp.getMobile()}</td>
<td>${emp.getSalary()}</td>
<td><a href="edit?id=${emp.id}"><button>edit</button></a></td>
<td><a href="delete?id=${emp.id}"><button>delete</button></a></td>
</tr>
</s:forEach>

</table><br>
<a href="home"><button>back</button></a>
</div>
</body>
</html>