package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public ServletLogin() {
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Comprar comprar = new Comprar();
		comprar.Codigo();
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
			
        LoginDAO logindao = new LoginDAO();
		
		comprar.setName(request.getParameter("nome"));
		comprar.setSenha(request.getParameter("senha"));
		comprar.setId(request.getParameter("id"));
		
        
		if( comprar.setName(request.getParameter("nome")) == "Sandra" && comprar.setSenha(request.getParameter("senha")) == "666" && comprar.setId(request.getParameter("id")) == "666" ){
			response.sendRedirect("index.html");
		} else {
		
		
		
		try {
			
			logindao.comparar(comprar);
			logindao.disconnect;
			
		} catch (SQLException e) {
			
		   // System.out.println("Deu Ruim");
			}
		
			response.sendRedirect("index.html");

	
		}

	}

}