package servlets;


import java.sql.*;

public class LoginDAO {
	private Connection connection;

	  public LoginDAO() {
	    this.connection = new Connection().getConnection();
	  }
	 
	  
	  public boolean comparar (Comprar comprar) throws SQLException {
		  try{
	          Connection connection = new Connection().getConnection();
	          } catch (RuntimeException e){
	          	System.out.println("Error! Os servidores sonharam com jigglypuffs e agora não sabem o que fazer.");
	          	return false;
	          
	          }
		  String sql = "insert into tb_passagens " +
		             "(NOME,IDADE,ASSENTO,CODIGO,PRECO)" +
		             " values (?,?,?,?,?);";
		             
		     try {
		    	 
		         PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		         
		 
		         stmt.setString(1,comprar.getName());
		         stmt.setString(2,comprar.getIdade());
		         stmt.setString(3,comprar.getAssento());
		         stmt.setString(4,comprar.getCodigo());
		         stmt.setString(5,comprar.compararIdade());
		        
		         
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
