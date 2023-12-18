package classe;

public class Cachorro {
	String nome;
	int idade;
	float peso;
	Raca raca;
	Dono dono;
	
	
	Cachorro(){
		
	}
	
	public Cachorro(String nome, int idade, float peso, Raca raca, Dono dono) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.raca = raca;
		this.dono = dono;
	}




	public String toString() {
		return "Cachorro [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", raca=" + raca + ", dono=" + dono
				+ "]";
	}
	
	
	
}
