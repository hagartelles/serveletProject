package controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClientDAO;
import model.Client;

@WebServlet("/ReadController")
public class ReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClientDAO clientDAO = new ClientDAO();
		List<Client> clients = clientDAO.findAll();
		request.setAttribute("clients", clients);
		
		RequestDispatcher rd = request.getRequestDispatcher("ReadClients.jsp");
		rd.forward(request, response);

	}

}
