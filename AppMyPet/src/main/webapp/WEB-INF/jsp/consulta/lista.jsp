<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastro de Consultas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container mt-3">
	  <h3>Consultas: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome Veterin�rio</th>
	        <th>Descri��o</th>
	        <th>Porte Animal</th>
	        <th>Pre�o</th>
	        <th>Local da Consulta</th>
	        <th>Data da Consulta</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="consulta" items="${listagem}">
		      <tr>
				<td>${consulta.id}</td>
				<td>${consulta.veterinario}</td>
				<td>${consulta.descricao}</td>
			    <td>${consulta.porteAnimal}</td>
		        <td>${consulta.preco}</td>
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