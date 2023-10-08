package classes;

public class Cachorro {
	String nome;
	int idade;
	Float peso;
	Raca raca;
	Dono dono;
	
	
	// Construtor
	Cachorro(){
		System.out.println("CONSTRUTOR VAZIo");
	}
	
	// Construtor
	public Cachorro(String nome, int idade, Float peso, Raca raca, Dono dono) {
		System.out.println("CONSTRUTOR CHEIO");
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.raca = raca;
		this.dono = dono;
	}
	

	
	// toString
	@Override
	public String toString() {
		return "Cachorro [\nnome=" + nome + ",\nidade=" + idade + ",\npeso=" + peso + ",\nraca=" + raca + ",\ndono=" + dono
				+ "]";
	}


	
	
	
}
