import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoBD {

	
	public Connection getConexao() {
		Connection conexao = null;
		String endereco = "jdbc:mysql://localhost:3306/lanchonete";
		String usuario = "root";
		String senha = "ifsp";
		
		
		try {
			conexao = DriverManager.getConnection(endereco, usuario, senha);
			JOptionPane.showMessageDialog(null, "BD conectado com sucesso !!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "BD NÃO conectado!");
		}
		
		return conexao;
		
	}
	
	
}
