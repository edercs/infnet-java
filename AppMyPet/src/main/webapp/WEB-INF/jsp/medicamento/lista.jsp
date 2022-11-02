<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Medicamentos</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Medicamentos: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Dosagem</th>
	        <th>Modo de Uso</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="medicamento" items="${listagem}">
		      <tr>
				<td>${medicamento.id}</td>
		        <td>${medicamento.nome}</td>
		        <td>${medicamento.dosagem}</td>
		        <td>${medicamento.modoDeUso}</td>
		        <td><a href="/medicamento/${s.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>