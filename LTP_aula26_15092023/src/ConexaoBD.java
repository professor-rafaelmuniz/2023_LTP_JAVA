import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBD {
	Connection conexao = null;
	
	
	public void conectarBD() {
		String url = "jdbc:mysql://localhost:3306/restaurante";
		String usuario = "root";
		String senha = "ifsp";
		Statement st;
		ResultSet rs;
		try {
			 conexao = DriverManager.getConnection(url, usuario, senha);
			 st = conexao.createStatement();
			 rs = st.executeQuery("select * from sobremesa");
			 while( rs.next()) {
				 System.out.println(rs.getString("nome"));
				 
			 }
			 
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
