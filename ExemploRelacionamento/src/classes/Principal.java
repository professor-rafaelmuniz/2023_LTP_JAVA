package classes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Chamando CONSTUTOR VAZIO
		Time timeA = new Time();
		timeA.nome = "2° INFO";
		timeA.posicao = 1;
		timeA.qtdJogadores = 6;
		
		Time timeB = new Time("1° Eletro",2);
		timeB.qtdJogadores = 5;
		
		Scanner sc = new Scanner(System.in);
		
		Tecnico tecnicoA = new Tecnico();
		System.out.println("Digite o nome:");
		tecnicoA.nome = sc.next();
		System.out.println("Digite a idade:");
		tecnicoA.idade =sc.nextInt();
		System.out.println("Digite a qtd de jogos:");
		tecnicoA.qtdJogos = sc.nextInt();
	
		timeA.tecnico = tecnicoA;
		System.out.println(timeA);
	}

}
