package classes;

import javax.swing.JOptionPane;

public class SalaDeAula {
	int numero ; // ou Integer
	char bloco;
	float largura; // ou Float
	int qtdCadeiras;
	boolean temProjetor;
	boolean eLaboratorio;
	Professor professor;
	
	// Construtores
	SalaDeAula(){
		JOptionPane.showMessageDialog(null, "Estou no construtor vazio");
	}
	
	SalaDeAula(int numero, char bloco){
		this.numero = numero;
		this.bloco = bloco;
	}
	
	
	public String toString() {
		return "Sala: " + this.bloco + this.numero +
				"Qtd cadeiras: " + this.qtdCadeiras;

	}
	
	
	
}
