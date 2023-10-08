import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Principal_comInnerJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConexaoBD con = new ConexaoBD();
		
		Connection conexao;
		
		conexao = con.getConexao();
		
		Statement st = null;
		ResultSet resultado = null;
		
		String query = "select * from delivery as d inner join produto as p on d.codigoProduto = p.codigo";
		try {
			
			st = conexao.createStatement();
			resultado = st.executeQuery(query);
			
			while (resultado.next()) {
				int codigo = resultado.getInt("codigo"); 
				String nome = resultado.getString("nome");
				float preco = resultado.getFloat("valor"); 
				int quantidade = resultado.getInt("qtd");
				
				Delivery d = new Delivery();
				d.setEndereco(resultado.getString("endereco"));
				d.setCodigo(resultado.getInt("codigo"));
				
				Produto p = new Produto(codigo, nome,preco, quantidade);
				JOptionPane.showMessageDialog(null, "Produto: " + nome +
													"\nValor: "+ preco +
													"\nQuantidade: "+ quantidade+
													"\nENDEREDO: " + d.getEndereco());
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
