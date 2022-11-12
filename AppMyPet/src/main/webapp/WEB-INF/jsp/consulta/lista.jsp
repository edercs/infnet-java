<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastro de Consultas</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Consultas: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Raça</th>
	        <th>Local</th>
	        <th>Data da Consulta</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="consulta" items="${listagem}">
		      <tr>
				<td>${consulta.id}</td>
		        <td>${consulta.raca}</td>
		        <td>${consulta.local}</td>
		        <td>${consulta.dataDaConsulta}</td>
		        <td><a href="/consulta/${consulta.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>