<%@ page import="java.util.List" %>
<%@ page import="proyectomodel.Carrera" %>
<%@page import="proyectomodel.dao.CarreraDao"%> 
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://fonts.googleapis.com/css2?family=Baloo+2:wght@400;500;600;700;800&family=Staatliches&display=swap"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/estilo.css">
<title>Consultar</title>
</head>
<body>

	<%@include file="includes/header.html"%>

	<section class="logins">
		<article class="listnart">
			<div class="consultar">
				<form class="subconsulta" action="BuscarController" method="post">
					<p>Consultar</p>
					<div>
						<input name="cod" placeholder="Codigo" type="text"
							required>
					</div>
					<button class="btnbuscar" type="submit" >Buscar</button>
				</form>
			</div>
<%-- 			<jsp:useBean id="cDao" class="proyectomodel.dao.CarreraDao" scope="request"></jsp:useBean> --%>
			<div id="main-container">
				<table>
					<thead>
						<tr>
							<th>Codigo</th>
							<th>Nombre</th>
							<th>Creditos</th>
							<th>Semestre</th>
						</tr>
					</thead>
					<tbody>
<%-- 						<c:forEach var="carrera" items="${cDao.list()}"/> --%>
<%-- 						<c:set var="carrera" scope="request" value="${requestScope.carrera}"/> --%>
						<tr>
							<td><c:out value="${codigo}" /></td>
							<td><c:out value="${nombre}" /></td>
							<td><c:out value="${credito}" /></td>
							<td><c:out value="${semestre}" /></td>
						</tr>
					</tbody>
				</table>
			</div>
		</article>
	</section>

	<%@include file="includes/footer.html"%>

</body>
</html>