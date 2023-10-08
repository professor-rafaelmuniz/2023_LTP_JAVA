public class Sorvete {
	String sabor;
	String cobertura;
	float preco;
	int tamanho;
	String adicional;
	
	Sorvete(){
		preco = 10.0f;
	}
	
	Sorvete(String sabor, int tamanho, String cobertura){
		this.sabor = sabor;
		this.cobertura = cobertura;
		this.tamanho = tamanho;
		if(tamanho == 500){
			preco = 20.0f;
		}
	}
	
	public String toString() {
		return "Sabor: " + sabor +
			   "\nTamanho: " + tamanho +
			   "\nCobertura: " + cobertura ;
	}
	
	
}
