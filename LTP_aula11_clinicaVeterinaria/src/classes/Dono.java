package classes;

public class Dono {
	String nome;
	String cpf;
	String telefone;
	String endereco;
	Cachorro cachorro;
	
	Dono(){
		
	}
	
	@Override
	public String toString() {
		return "Dono [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone +  "]";
	}

}
