package classes;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro c1 = new Cachorro();

		c1.nome = JOptionPane.showInputDialog("Digite o nome do cachorro:");
		c1.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
		c1.peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso"));
		
		//JOptionPane.showMessageDialog(null, c1.nome);

		Raca raca = new Raca("Vira-Lata", "Brasil");
		
		Raca raca2 = new Raca();
		raca2.nome = "Caramelo";
		raca2.origem = "Brasil";
		
		Dono dono = new Dono();
		dono.nome = JOptionPane.showInputDialog("Digite o nome do dono:");
		dono.cpf = JOptionPane.showInputDialog("Digite o cpf:");
		dono.endereco = JOptionPane.showInputDialog("Digite o endereco:");
		dono.telefone = JOptionPane.showInputDialog("Digite o telefone:");
		
		c1.raca = raca2;
		c1.dono = dono;
		
		JOptionPane.showMessageDialog(null, c1);
		
		
		
	}

}
