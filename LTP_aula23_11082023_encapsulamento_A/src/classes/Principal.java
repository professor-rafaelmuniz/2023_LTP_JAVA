package classes;

public class Principal {
	public static void main(String args[]) {
		Eleitor eleitor = new Eleitor();
		
		
		eleitor.getnome = "Teste";
		eleitor.idade = 5;
		
		eleitor.votar();
	}
	
}
