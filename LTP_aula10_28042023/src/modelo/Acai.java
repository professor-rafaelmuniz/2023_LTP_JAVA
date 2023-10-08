package modelo;

public class Acai {
	int codigo;
	String tipo;
	Integer tamanho;
	float preco;
	
	Acai(int codigo){
		this.tipo = "Açai com banana";
		if (codigo == 1) {
			this.codigo = 1;
			this.preco = 15.0f;
			this.tamanho = 300;
		}else if(codigo == 2) {
			this.codigo = 2;
			this.preco = 21.0f;
			this.tamanho = 500;
		}else if(codigo == 3) {
			this.codigo = 3;
			this.preco = 25.0f;
			this.tamanho = 700;
		}
	}
	
	
	public String toString() {
		
		return 	"Código: " + this.codigo+
				"\nTipo: " + this.tipo +
				"\nTamanho: " + this.tamanho +
				"\nPreço: " + this.preco;
	}
	
}
