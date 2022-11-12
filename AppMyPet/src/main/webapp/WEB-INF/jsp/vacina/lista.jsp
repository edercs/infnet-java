<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastro de Vacinas</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Vacinas: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Descrição</th>
	        <th>Idade Indicada</th>
	        <th>Tipo Animal</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="v" items="${listagem}">
		      <tr>
				<td>${v.descricao}</td>
		        <td>${v.idadeIndicada}</td>
		        <td>${v.tipoAnimal}</td>
		        <td><a href="/vacina/${v.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>