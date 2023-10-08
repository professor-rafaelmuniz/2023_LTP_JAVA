package br.edu.ifsp.bra.classe;

import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]) {
		System.out.println("##################");
		System.out.println(" LOJA DE AÇAI");
		System.out.println("##################");
		System.out.println("MENU:");
		System.out.println(" 1 - Açai 300ml:");
		System.out.println(" 2 - Açai 500ml:");		
		System.out.println(" 3 - Açai 700ml:");	
			
		Scanner sc = new Scanner(System.in);
		
		int numero;
		do {
			System.out.println("Digite o número do açai desejado(1,2 ou 3):");
			numero = sc.nextInt();
			 if (numero < 1 || numero > 3) {
				 System.out.println("Número inválido!");
			 }
		}while(numero < 1 || numero > 3);
		
		
			
		Acai a1 = new Acai(numero);
		System.out.println("Deseja adicionar um acompanhamento: [s ou n]");
		char adicionarAcompanhamento;
		
		adicionarAcompanhamento = sc.next().charAt(0);
		
		if (adicionarAcompanhamento == 's') {
			System.out.println("######## ACOMPANHAMENTOS #####");
			System.out.println("1 - Paçoca - R$ 2.00 ");
			System.out.println("2 - M & M - R$ 3.50");
			System.out.println("3 - Granola - R$ 1.00");
			
			do{
				System.out.println("Digite 1, 2 ou 3: ");
				numero = sc.nextInt();
			}while(numero < 1 || numero > 3);
			
			// Associação entre os objetos
			Acompanhamento acompanhamento1 = new Acompanhamento(numero);
			a1.acompanhamento = acompanhamento1;

		}

	
		System.out.println(a1);	
		System.out.println(a1.calcularPrecoFinal());
		
	}
}
