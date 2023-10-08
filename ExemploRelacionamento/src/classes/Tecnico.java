package classes;

public class Tecnico {
	String nome;
	int idade;
	int tempoAtuacao;
	int qtdJogos;
	int qtdVitorias;
	int qtdDerrotas;
	int qtdEmpates;
	float salario;
	
	//Construtor
	Tecnico(){
		
	}
	//toString

	@Override
	public String toString() {
		return "Tecnico [nome=" + nome + ", idade=" + idade + ", tempoAtuacao=" + tempoAtuacao + ", qtdJogos="
				+ qtdJogos + ", qtdVitorias=" + qtdVitorias + ", qtdDerrotas=" + qtdDerrotas + ", qtdEmpates="
				+ qtdEmpates + ", salario=" + salario + "]";
	}
	
}
