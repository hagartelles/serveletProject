<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Lista de Clientes</title>
    <!-- Incluindo arquivos CSS do Bootstrap -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <!-- Cabeçalho -->
    <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark text-light">
            <div class="container">
                 <a class="navbar-brand" href="Index.html"><img src="./img/BeLTOUR.png"/ height="64px"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="ReadController">Cadastros</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#sobre">Sobre</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#contato">Contato</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <!-- Corpo da Página -->
    <div class="container">
    <h2>Gerenciamento de Clientes</h2>

    <!-- Formulário para Ações de Cliente -->
	<form id="cliente-form">
	  <a href="CreateClient.jsp" class="btn btn-primary" name="cadastrar">Cadastrar Cliente</a>
	  <a href="ReadController" class="btn btn-primary" name="procurar">Procurar Clientes</a>
	</form>
  </div>
    
    <div class="container">
        <h2>Lista de Clientes</h2>
        
        <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>CPF</th>
                    <th>Nome</th>
                    <th>Data de Nascimento</th>
                    <th>Endereço</th>
                    <th>Email</th>
                    <th>Telefone</th>
                </tr>
            </thead>
            <tbody>
                <!-- Use Thymeleaf para iterar sobre a lista de clientes e exibi-los -->
                <c:forEach items="${clients}" var="clients">
                    <tr class="text-center">
                        <td>${clients.id}</td>
                        <td>${clients.cpf}</td>
                        <td>${clients.nome}</td>
                        <td>${clients.bornDate}</td>
                        <td>${clients.adress}</td>
                        <td>${clients.email}</td>
                        <td>${clients.tel}</td>
						<td><a href="UpdateController?id=${clients.id}" class="btn btn-primary" name="atualizar">Atualizar Cliente</a></td>
						<td><a href="DeleteController?id=${clients.id}" class="btn btn-danger" name="excluir">Excluir Cliente</a></td>
                	</tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    
    <div class="text-center mt-3">
        <a href="Index.html" class="btn btn-secondary">Voltar</a>
    </div>

    <!-- Rodapé -->
    <footer class="bg-dark text-light text-center py-3 fixed-bottom">
        &copy; 2023 Sua Empresa. Todos os direitos reservados.
    </footer>

    <!-- Incluindo arquivos JavaScript do Bootstrap e jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.min.js"></script>
</body>
</html>
