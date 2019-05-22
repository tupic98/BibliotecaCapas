<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library</title>
</head>
<body>
	<h1>Biblioteca virtual</h1>
	<h3>Hay ${nLibros} libros en existencia, de ${authorsQuantity} cantidad
		de autores diferentes</h3>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Titulo</th>
				<th>Autor</th>
				<th>ISBN</th>
				<th>Genero</th>
				<th>Cantidad</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${books}" var="book">
				<tr>
					<td>${book.bookId}</td>
					<td>${book.bookTitle}</td>
					<td>${book.bookAuthor}</td>
					<td>${book.bookISBN}</td>
					<td>${book.bookGenre}</td>
					<td>${book.bookQuantity}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>