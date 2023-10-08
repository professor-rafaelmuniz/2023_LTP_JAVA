import javax.swing.JOptionPane;

public class Motorista {
	String nome;
	String telefone;
	String numeroCNH;
	char tipoCarteira;
	

	
	public Motorista() {
		this.nome = JOptionPane.showInputDialog("Digite o nome: ");
		this.telefone = JOptionPane.showInputDialog("Digite o telefone: ");
		this.numeroCNH = JOptionPane.showInputDialog("Digite a CNH: ");
		this.tipoCarteira = JOptionPane.showInputDialog("Digite o tipo da CNH:").charAt(0);
	}



	@Override
	public String toString() {
		return "Motorista [nome=" + nome + ", telefone=" + telefone + ", numeroCNH=" + numeroCNH + ", tipoCarteira="
				+ tipoCarteira + "]";
	}
	
}
