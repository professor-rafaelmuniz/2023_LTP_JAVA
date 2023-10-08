package classes;

public class Raca {
	String nome;
	String origem;
	
	
	
	Raca(){
		
	}
	@Override
	public String toString() {
		return "Raca [nome=" + nome + ", origem=" + origem + "]";
	}


	public Raca(String nome, String origem) {
		super();
		this.nome = nome;
		this.origem = origem;
	}
	
	
	
}
