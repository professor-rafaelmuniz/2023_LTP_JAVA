package classe;

public class Raca {
	String nome;
	String origem;

	Raca(int cod){
		if (cod == 1) {
			this.nome = "Vira-lata";
			this.origem = "Brasil";
		}else if (cod == 2){
			this.nome = "Poodle";
			this.origem = "EUA";
		}
		
	}
	
	public String toString() {
		return "Raca [nome=" + nome + ", origem=" + origem + "]";
	}
	
	
	
	
}
