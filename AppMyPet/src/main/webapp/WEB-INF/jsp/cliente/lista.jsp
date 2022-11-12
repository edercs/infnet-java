<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastro de Clientes</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Clientes: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>nome</th>
	        <th>Endereço</th>
	        <th>Telefone</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="cliente" items="${listagem}">
		      <tr>
				<td>${cliente.id}</td>
				<td>${cliente.nome}</td>
		        <td>${cliente.endereco}</td>
		        <td>${cliente.telefone}</td>
		        <td><a href="/cliente/${cliente.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>