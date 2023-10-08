import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Sobremesa> listaSobremesa = new ArrayList<Sobremesa>();
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		
		Sobremesa brigadeiro = new Sobremesa();
		int opcao;
		//

		ConexaoBD con = new ConexaoBD();
		con.conectarBD();
		
		
		
		
		do {
			
			brigadeiro.setNome(JOptionPane.showInputDialog("Digite o nome da sobremesa:"));
			brigadeiro.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o preço da sobremesa")));
			listaSobremesa.add(brigadeiro);
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para sair ou 1 para continuar"));
		}while(opcao != 0);
		
		
		
	}

}
