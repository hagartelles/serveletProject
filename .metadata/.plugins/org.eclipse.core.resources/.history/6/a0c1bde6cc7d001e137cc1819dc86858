<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Atualizar Cliente</title>
    <!-- Incluindo arquivos CSS do Bootstrap -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <!-- Cabeçalho -->
    <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark text-light">
            <div class="container">
                <a class="navbar-brand" href="#"><img src="./icon/samurai.png" height="48px"></a>
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
    
    <div class="container">
	    <h2>Gerenciamento de Clientes</h2>
	
	    <!-- Formulário para Ações de Cliente -->
		<form id="cliente-form">
		  <a href="CreateClient.jsp" class="btn btn-primary" name="cadastrar">Cadastrar Cliente</a>
		  <a href="ReadController" class="btn btn-primary" name="procurar">Procurar Clientes</a>

		</form>
  	</div>

    <!-- Corpo da Página -->
    <div class="container">
        <h2>Atualizar Cliente</h2>
        <form action="UpdateController?id=${client.id}" method="post">
            <div class="form-group">
                <label for="id">ID do Cliente </label>
                <input type="text" class="form-control" id="id" name="id" value="${client.id}" disabled>
            </div>

            <div class="form-group">
                <label for="cpf">CPF (11 dígitos):</label>
                <input type="text" class="form-control" id="cpf" name="cpf" value="${client.cpf}" required pattern="\d{11}">
            </div>

            <div class="form-group">
                <label for="nome">Nome (até 30 caracteres):</label>
                <input type="text" class="form-control" id="nome" name="nome" value="${client.nome}"maxlength="30" required>
            </div>

            <div class="form-group">
                <label for="bornDate">Data de Nascimento (AAAA-MM-DD):</label>
                <input type="text" class="form-control" id="bornDate" name="bornDate" value="${client.bornDate}" required pattern="\d{4}-\d{2}-\d{2}">
            </div>

            <div class="form-group">
                <label for="adress">Endereço (até 30 caracteres):</label>
                <input type="text" class="form-control" id="adress" name="adress" value="${client.adress}" maxlength="30">
            </div>

            <div class="form-group">
                <label for="email">Email (até 30 caracteres):</label>
                <input type="email" class="form-control" id="email" name="email" value="${client.email}" maxlength="30">
            </div>

            <div class="form-group">
                <label for="tel">Telefone (até 16 dígitos):</label>
                <input type="text" class="form-control" id="tel" name="tel" value="${client.tel}" pattern="\d{1,16}">
            </div>

            <button type="submit" class="btn btn-primary">Atualizar</button>
        </form>
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
