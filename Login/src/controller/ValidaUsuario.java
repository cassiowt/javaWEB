package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Usuario;

/**
 * Servlet implementation class ConsultaUsuarioServlet
 */
@WebServlet(name = "validaUsuario", urlPatterns = { "/validaUsuario" })
public class ValidaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ValidaUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Usuario user = new Usuario();

		user.setLogin((String) request.getParameter("login"));
		user.setSenha((String) request.getParameter("senha"));

		HttpSession session = request.getSession(true);
		session.setAttribute("usuario", user);

		if (user.getLogin().equals("adm") && user.getSenha().equals("123")) {
			request.getRequestDispatcher("bemVindo.jsp").forward(request, response);
		} else {

			request.getRequestDispatcher("erros.jsp").forward(request, response);
		}
	}
}
