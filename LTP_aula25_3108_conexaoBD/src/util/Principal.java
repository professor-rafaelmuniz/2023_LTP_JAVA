package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConexaoBD conexao = new ConexaoBD();
		Connection conn = conexao.getConexao();
		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
		
		
		try {
			Statement st = conn.createStatement();
			String query = "select * from aluno";
			ResultSet resultado = st.executeQuery(query);
			
			while(resultado.next()) {
				String nome = resultado.getString("nome");
				String prontuario = resultado.getString("prontuario");
				int codigo = resultado.getInt("codigo");
				JOptionPane.showMessageDialog(null, "NOME: "+ nome+
													"\nProntuário: " 
													+ prontuario+ 
													"\nCódigo: "+
													codigo);
				
				Aluno aluno = new Aluno(codigo, nome, prontuario);
				
				
				
				Disciplina ltp = new Disciplina();
				ltp.setNome("LTP");
				ltp.setProfessor("Eu");
				
				ArrayList<Disciplina> d = new ArrayList<Disciplina>();
				d.add(ltp);
				
				
				aluno.inserirDisciplina(ltp);
				aluno.setListaDisciplina(d);
				
				listaAluno.add(aluno);
				
				
				
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
