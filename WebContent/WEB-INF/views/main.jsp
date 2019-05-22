<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library</title>
</head>
<body>
	<h1>Biblioteca virtual</h1>
	<form method="post"
		action="${pageContext.request.contextPath}/filteredBooks">
		<label for="search">Texto a buscar:</label> <input id="search"
			name="search" type="text" /> <input type="submit" value="Buscar" />
		<label>Buscar por:</label> 
		<select name="selected">
			<option value=""></option>
			<option value="0">Título</option>
			<option value="1">Autor</option>
			<option value="2">ISBN</option>
			<option value="3">Genero</option>
		</select>
	</form>
	<br>
	<form action="${pageContext.request.contextPath}/inventory" method="get">
		<input type="submit" value="Ver todos">
	</form>
</body>
</html>