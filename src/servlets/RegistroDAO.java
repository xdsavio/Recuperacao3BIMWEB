package servlets;

import java.sql.*;

public class RegistroDAO {

	private Connection connection;

	  public RegistroDAO() {
	    this.connection = new Connection().getConnection();
	  }
	 
	  
	  public boolean conection (Comprar comprar) throws SQLException {
		  try{
	          Connection connection = new Connection().getConnection();
	          } catch (RuntimeException e){
	          	System.out.println("Erro! Nossos servidores estão muito ocupados ouvindo Arctic Monkeys na bad, tente mais tarde.");
	          	return false;
	          
	          }
		  
		  String sql = "INSERT INTO tb_login " +
		             "(NOME,IDADE,CIDADE,ID,ENDERECO,SENHA)" +
		             " values (?,?,?,?,?,?);";
		             
		     try {
		    	 
		         PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		         
		 
		         stmt.setString(1,comprar.getName());
		         stmt.setString(2,comprar.getIdade());
		         stmt.setString(3,comprar.getCidade());
		         stmt.setString(4,comprar.getId());
		         stmt.setString(5,comprar.compararEndereco());
		         stmt.setString(6,comprar.compararSenha());
		        
		         
		         stmt.execute();
		         stmt.close();
		         
		         
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		     return true;
	  }
	  
	  public void disconnect() throws SQLException {
			this.connection.close();	
	  }
	
	
}
