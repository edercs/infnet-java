<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastro de Vacinas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container mt-3">
	  <h3>Vacinas: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Descrição</th>
	        <th>Porte do Animal</th>
	        <th>Preço</th>
	        <th>Tipo</th>
	        <th>Idade Indicada</th>
	        <th>Tipo Animal</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="v" items="${listagem}">
		      <tr>
			    <td>${v.id}</td>
			    <td>${v.descricao}</td>
			    <td>${v.porteAnimal}</td>
		        <td>${v.preco}</td>
				<td>${v.tipo}</td>
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