package servlets;

import java.sql.*;

public class TotalDAO {

	  private Connection connection;

	  public ComprarDao() {
	    this.connection = new Connection().getConnection();
	  }
	 
	  
	  public boolean insert (Comprar comprar) throws SQLException {
		  try{
	          Connection connection = new Connection().getConnection();
	          } catch (RuntimeException e){
	          	System.out.println("Error 3115");
	          	return false;
	          
	          }
		  String sql = "SELECT PRECO FROM tb_passagens;";
		             
		     try {
		    	 
		         PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
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
