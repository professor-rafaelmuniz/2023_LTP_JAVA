package modelos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	
	
	public static void main(String[] args) {
	
		
		
		ArrayList<Cliente> listaDeClientes 	= new ArrayList<Cliente>();
		ArrayList<Produto> listaDeProdutos 	= new ArrayList<Produto>();
		ArrayList<Venda> listaDeVendas 		= new ArrayList<Venda>();
		int codigoProduto = 1001;	
		int codigoVenda = 2301;
		
		String menu =   " ##### LOJA DE TI #####"+
						"\n1 - Cadastrar Produto "+
						"\n2 - Listar Produtos"+
						"\n3 - Cadastrar Cliente"+
						"\n4 - Listar Clientes"+
						"\n5 - Realizar Venda"+
						"\n6 - Listar Vendas"+
						"\n0 - Sair\n\n"+
						"Digite sua opção:";
		int opcao;
		
		do {
			do {			
				opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				if (opcao <0 || opcao > 6) {
					JOptionPane.showMessageDialog(null, "Opção inválida");
				}
			}while(opcao < 0 || opcao >6);// Verifica opção
			
			if (opcao == 1 ) {
			// Cadastrar Produto
				Produto p = new Produto(codigoProduto);
				codigoProduto++;
				listaDeProdutos.add(p);
				
			}else if(opcao == 2) {
				// Listar Produtos
				JOptionPane.showMessageDialog(null, listaDeProdutos);
				
			}else if(opcao ==3) {
				Cliente c = new Cliente();
				listaDeClientes.add(c);
				
			}else if(opcao == 4) {
				JOptionPane.showMessageDialog(null, listaDeClientes);
			}else if(opcao == 5) {
				Venda v = new Venda(codigoVenda);
				v.selecionarClienteDaVenda(listaDeClientes);
				v.selecionarProdutosDaVenda(listaDeProdutos);
				listaDeVendas.add(v);
				codigoVenda++;
			}else if(opcao == 6) {// LISTAR VENDAS	
				JOptionPane.showMessageDialog(null, listaDeVendas);
			}
			
		} while(opcao != 0);
		
		
		
		
		
		

	}

}
