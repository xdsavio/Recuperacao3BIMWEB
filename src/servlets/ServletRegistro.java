package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRegistro
 */
@WebServlet("/ServletRegistro")

public class ServletRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletRegistro() {
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Comprar comprar = new Comprar();
		comprar.Codigo();
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
			
        RegistroDAO registrodao = new RegistroDao();
		
		comprar.setNome(request.getParameter("nome"));
		comprar.setSenha(request.getParameter("senha"));
		comprar.setEndereco(request.getParameter("endereco"));
		comprar.setIdade(request.getParameter("idade"));
		comprar.setCidade(request.getParameter("cidade"));
         
		comprar.compararIdade();
		
        try {
			
			comprardao.insert(comprar);
			comprardao.disconnect();
			
		} catch (SQLException e) {
			
			System.out.println("Vá andando");
		}
		
		response.sendRedirect("Bait.html");

	}
	}

}
