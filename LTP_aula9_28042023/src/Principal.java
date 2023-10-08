import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		Sorvete sorvete = new Sorvete();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o sabor do sorvete:");
		sorvete.sabor = sc.next();
		System.out.println("Digite o tamanho:");
		sorvete.tamanho = sc.nextInt();
		System.out.println("Digite a cobertura:");
		sorvete.cobertura = sc.next();
		System.out.println("Digite o sabor do sorvete:");
		String sabor = sc.next();
		System.out.println("Digite o tamanho:");
		int tamanho = sc.nextInt();
		System.out.println("Digite o sabor do sorvete:");
		String cobertura = sc.next();
		Sorvete sorvete2 = new Sorvete(sabor,tamanho, cobertura);
		
		System.out.println("SORVETE: " + sorvete);
		System.out.println("SORVETE: " + sorvete2);
		
		
		
		
	}
}
