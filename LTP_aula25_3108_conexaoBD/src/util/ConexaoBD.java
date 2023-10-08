package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;;

public class ConexaoBD {
	
	public Connection getConexao() {
		
		Connection conexao = null;
		String url = "jdbc:mysql://localhost:3306/teste";
		String usuario ="root";
		String senha = "ifsp";
		
		try {
			conexao = DriverManager.getConnection(url,usuario,senha);
			JOptionPane.showMessageDialog(null, "Banco de dados encontrado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"Banco de dados fora do ar!");
			e.printStackTrace();
		}

		
		return conexao;
	}
	

	
	
}
