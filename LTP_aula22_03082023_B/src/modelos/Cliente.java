package modelos;

import java.util.Objects;

import javax.swing.JOptionPane;

public class Cliente {
	
	String nome;
	String telefone;
	String endereco;
	
	public Cliente(){
		this.nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
		this.telefone = JOptionPane.showInputDialog("Digite o telefone do cliente: ");
		this.endereco = JOptionPane.showInputDialog("Digite o endereço do cliente: ");
	}
	
	public Cliente(String nome){
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(telefone);
	}

	@Override
	public boolean equals(Object obj) {
		Cliente other = (Cliente) obj;
		return Objects.equals(telefone, other.telefone);
	}


	

}
