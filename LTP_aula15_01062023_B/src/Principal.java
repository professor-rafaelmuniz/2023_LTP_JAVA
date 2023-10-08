import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String args[]) {
		
		int opcao;
		
		String menu = "**** MENU ***** \n"
				+ " 1 - Cadastrar evento\n"
				+ " 2 - Cadastrar Atração\n"
				+ " 3 - Listar evento e atrações\n"
				+ " 0 - para Sair";
		

		Evento pdm = null;
		
		do{
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(opcao) {
				case 1: 
					pdm  = new Evento();
				break;
				case 2:
					Atracao atracao = new Atracao();
					pdm.listaAtracoes.add(atracao);
				break;
				case 3:
					JOptionPane.showMessageDialog(null, pdm);
				break;
				default:
					JOptionPane.showMessageDialog(null, "Até logo !!!");
			}
		}while(opcao != 0);
			
	}
	
	
}
