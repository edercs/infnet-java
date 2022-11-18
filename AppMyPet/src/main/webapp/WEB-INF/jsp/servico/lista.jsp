<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastro de Serviços</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h3>Serviços: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Descrição</th>
	        <th>Porte do Animal</th>
	        <th>Preço</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="servico" items="${listagem}">
		      <tr>
				<td>${servico.id}</td>
		        <td>${servico.descricao}</td>
		        <td>${servico.porteAnimal}</td>
		        <td>${servico.preco}</td>
		        <td><a href="/servico/${servico.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>