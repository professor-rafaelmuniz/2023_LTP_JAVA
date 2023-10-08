import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Caminhao c1 = new Caminhao(2);
		c1.cadastrarNovoCaminhao();
		
		Motorista m1 = new Motorista();
		
		c1.associarMotoristaNoCaminhao(m1);
		
		JOptionPane.showMessageDialog(null, c1);
		
	}

}
