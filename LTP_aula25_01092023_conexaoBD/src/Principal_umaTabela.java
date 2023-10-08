import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Principal_umaTabela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConexaoBD con = new ConexaoBD();
		
		Connection conexao;
		
		conexao = con.getConexao();
		
		Statement st = null;
		ResultSet resultado = null;
		
		String query = "select * from produto";
		try {
			
			st = conexao.createStatement();
			resultado = st.executeQuery(query);
			
			while (resultado.next()) {
				int codigo = resultado.getInt("codigo"); 
				String nome = resultado.getString("nome");
				float preco = resultado.getFloat("valor"); 
				int quantidade = resultado.getInt("qtd");
				
				Produto p = new Produto(codigo, nome,preco, quantidade);
				JOptionPane.showMessageDialog(null, "Produto: " + nome +
													"\nValor: "+ preco +
													"\nQuantidade: "+ quantidade);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
