package br.edu.ifsp.bra.classe;

public class Acompanhamento {
	int codigo;
	String nome;
	float preco;

	// Construtor
	Acompanhamento(){
		
	}
	
	Acompanhamento(int codigo){
		if (codigo == 1) {
			this.nome = "Paçoca";
			this.codigo = 1;
			this.preco = 2.00f;
		}else if(codigo == 2) {
			this.nome = "M&M";
			this.codigo = 2;
			this.preco = 3.50f;
		}else if (codigo == 3){
			this.nome = "Granola";
			this.codigo = 3;
			this.preco = 1.00f;
		}
	}
	
	//toString
	public String toString() {
		return   "Acompanhamento selecionado: " + this.nome
				+" - Preço: " + this.preco; 
	}
	
	
}
