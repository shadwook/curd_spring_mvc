<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Edit Employee Recordes</h1>
<form action="update" method="post" autocomplete="on">
<fieldset style="width: 30%;background-color: #42e5b6">
<input type="naumber" name="id" value="${emp.id}" hidden>
	Name 	: <input type="text" name="name" value="${emp.name}"><br><br>
	Email	: <input type="email" name="email" value="${emp.email}"><br><br>
	Mobile 	: <input type="number" name="mobile" value="${emp.mobile}"><br><br>
	Salary 	: <input type="number" name="salary" value="${emp.salary}"><br><br>
	<br>
	<button>Update</button>
</fieldset>

</form>
<a href="fetch"><button>Back</button></a>
</div>
</body>
</html>