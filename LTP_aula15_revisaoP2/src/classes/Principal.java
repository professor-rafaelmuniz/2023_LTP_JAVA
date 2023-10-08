package classes;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String args[]) {
		
		// Criar objeto
		//NomeClasse referencia = new NomeClasse();
		
		SalaDeAula a402 = new SalaDeAula();
		a402.bloco = 'A';
		a402.numero = 402;
		a402.qtdCadeiras = 20;
		a402.temProjetor = true;
		a402.eLaboratorio = true;
		a402.largura = 15.8f;
		
		
		Professor rafaelMuniz = new Professor();
		a402.professor = rafaelMuniz;
		
		
		
		char bloco = JOptionPane.showInputDialog("Digite o blodo da sala: ").charAt(1);
		int numero ;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do sala:"));
		
		SalaDeAula a401 = new SalaDeAula(numero, bloco);
		
		JOptionPane.showMessageDialog(null, a401);
		
		//Scanner sc = new Scanner(System.in);
		
		
		
		
		
	}
	
}
