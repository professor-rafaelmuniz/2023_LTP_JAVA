package classes;

import javax.swing.JOptionPane;

public class Eleitor {
	private String nome;
	private int idade;

	//ENCAPSULAMENTO
	
	public Eleitor() {
		this.nome = JOptionPane.showInputDialog("Digite o nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
		
		if (idade < 16) {
			JOptionPane.showMessageDialog(null, "NÃO PODE VOTAR");
		}else {
			JOptionPane.showMessageDialog(null, "PODE VOTAR");
			votar();
		}
	}
	
	
	public void votar() {
		if (idade > 16) {
			JOptionPane.showMessageDialog(null, "DIGITE SEU VOTO");
		}
	}
	
}
