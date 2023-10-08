package classes;

public class Time {
	String nome;
	int qtdJogadores;
	int posicao;
	String nacionalidade;
	Tecnico tecnico;
	
	//Construtor
	Time(){
		System.out.println("0 parametro");
		this.nacionalidade = "Brasileira";
	}
	
	Time(String nome, int posicao){
		System.out.println("2 parametros");
		this.nome = nome;
		this.posicao = posicao;
		this.nacionalidade = "Brasileira";
	}
	
	public String toString() {
		return  "Nome do time: "+ this.nome
				+"\nPosicao: "+ this.posicao 
				+"\nJogadores: "+ this.qtdJogadores
				+"\nNacionalidade: " + this.nacionalidade
				+"\n " + this.tecnico;
	}
	
}
