<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastro de Clientes</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
		<h3>Clientes: ${listagem.size()}</h3>

		<h4><a href="/cliente">Novo Cliente</a></h4>

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
		       <td>${cliente.email}</td>
		       <td>${cliente.telefone}</td>
		       <td><a href="/cliente/${cliente.id}/excluir">excluir</a></td>
		     </tr>
		    </c:forEach>
		  </tbody>
		</table>
	</div>
</body>
</html>