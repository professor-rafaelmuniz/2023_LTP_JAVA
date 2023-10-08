package br.edu.ifsp.bra.classe;

public class Acai {
	int tamanho;
	float preco;
	
	Acai(int numero){
		if (numero == 1) {
			this.tamanho = 300;
			this.preco = 15.0f;
		}else if(numero == 2){
			this.tamanho = 500;
			this.preco = 19.00f;
		}else if(numero == 3){
			this.tamanho = 700;
			this.preco = 21.50f;
			
		}else {
			System.out.println("Número inválido");
		}
	}// final construtor
	
	public String toString() {
		return "AÇAI SELECIONADO: " + tamanho +" - Valor: "+ preco;
	}
	
}
