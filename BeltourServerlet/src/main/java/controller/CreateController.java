package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClientDAO;
import model.Client;


@WebServlet("/CreateController")
public class CreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Client client = new Client();
		
		client.setCpf(Long.parseLong(request.getParameter("cpf")));
		client.setNome(request.getParameter("name"));
		client.setBornDate(LocalDate.parse(request.getParameter("bornDate")));
		client.setAdress(request.getParameter("adress"));
		client.setEmail(request.getParameter("email"));
		client.setTel(Long.parseLong(request.getParameter("tel")));
		client.setCreatedTime(LocalDate.now());
		
		ClientDAO clienteDAO = new ClientDAO();
		clienteDAO.createClient(client);
		
		response.sendRedirect("Index.html");
	}

}
