import java.util.Objects;

import javax.swing.JOptionPane;

public class Cliente {
	String prontuario;
	String nome;
	String telefone;
	
	Cliente(){
		this.prontuario = JOptionPane.showInputDialog("Digite o prontuário do cliente:");
		this.nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
		this.telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
	}
	
	@Override
	public String toString() {
		return "\nCliente [prontuario=" + prontuario + ", nome=" + nome + ", telefone=" + telefone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(prontuario);
	}

	@Override
	public boolean equals(Object obj) {
		Cliente other = (Cliente) obj;
		return Objects.equals(prontuario, other.prontuario);
	}

	

	
	
	
}
