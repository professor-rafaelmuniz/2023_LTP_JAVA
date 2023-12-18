package classe;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro c1 = new Cachorro();
		c1.nome = JOptionPane.showInputDialog("Digite o nome do cachorro:");
		c1.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
		c1.peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do au au:"));
	
		Raca r1 = new Raca(2);
		c1.raca = r1;
		
		Dono dono1 = new Dono();
		dono1.nome = JOptionPane.showInputDialog("Digite o nome do dono:");
		dono1.cpf = JOptionPane.showInputDialog("Digite o nome do CPF:");
		dono1.telefone = JOptionPane.showInputDialog("Digite o nome do Telefone:");
		
		JOptionPane.showMessageDialog(null, c1);
	
	
	}

}
