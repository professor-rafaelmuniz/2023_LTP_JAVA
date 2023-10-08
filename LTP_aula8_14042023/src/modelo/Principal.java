package modelo;

import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("#####################");
		System.out.println("#    LOJA DE AÇAI   #");
		System.out.println("#####################");
		System.out.println("MENU:");
		System.out.println("1 - Açai com banana 300ml");
		System.out.println("2 - Açai com banana 500ml");
		System.out.println("3 - Açai com banana 700ml");
		
		int codigo;
		do {
			System.out.println("Digite 1, 2 ou 3: ");
			codigo = teclado.nextInt();
		}while(codigo < 1 || codigo > 3  );
		
		
		
		Acai acaiComNutella = new Acai(codigo);
		
		System.out.println("Saida: " + acaiComNutella);
		
		
		
		
	}
}
