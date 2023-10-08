import java.util.ArrayList;
import java.util.Optional;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		ArrayList<Cliente> listaClientes 	= new ArrayList<Cliente>();
		ArrayList<Produto> listaProdutos 	= new ArrayList<Produto>();
		ArrayList<Venda>   listaVendas 		= new ArrayList<Venda>();
		int codigoProduto = 2301;
		int codigoVenda = 5002;
		
		String menu =		" #####   MENU  ##### "+
							"\n\n"+
							"1 - Cadastrar Produto\n"+
							"2 - Cadastrar Cliente\n"+
							"3 - Realizar Venda\n"+
							"4 - Listar Produtos\n"+
							"5 - Listar Clientes\n"+
							"6 - Listar Vendas\n"+
							"0 - SAIR\n\n"+
							"Informe a opção desejada:";
							
		int opcao;

		do {
			
			do {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				if (opcao < 0 || opcao > 6) {
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
			}while(opcao < 0 || opcao > 6);
		
			switch(opcao) {
				case 0:
					JOptionPane.showMessageDialog(null, "Tchau !! Sextou !!");
				break;
				case 1:// CADASTRAR PRODUTO
					Produto p = new Produto(codigoProduto);
					listaProdutos.add(p);
					codigoProduto++;
				break;
				case 2:// CADASTRAR CLIENTE
					Cliente c = new Cliente();
					listaClientes.add(c);
				break;
				case 3:// Realizar Venda
					Venda venda = new Venda(codigoVenda);
					//venda.selecionarClienteDaVenda(listaClientes);
					venda.selecionarProdutosDaVenda(listaProdutos);
					
					listaVendas.add(venda);
					
				break;
				case 4:// LISTAR PRODUTOS
					JOptionPane.showMessageDialog(null, listaProdutos);
				break;
				case 5:
					JOptionPane.showMessageDialog(null, listaClientes);
				break;
				case 6:
					JOptionPane.showMessageDialog(null, listaVendas);
				break;
	
				
				
			}
		}while(opcao != 0);
		
		
		
		
		
		
	}

}
