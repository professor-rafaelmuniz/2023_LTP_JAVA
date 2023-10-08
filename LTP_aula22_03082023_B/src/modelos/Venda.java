package modelos;

import java.util.ArrayList;

import javax.swing.JOptionPane;
 
public class Venda {
	int codVenda;
	String dataVenda;
	Cliente cliente;
	ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
	double valorVenda;
	
	Venda(int codigo){
		this.codVenda = codigo;
		this.dataVenda = JOptionPane.showInputDialog("Digite a data da venda:");
		
	}
	
	public void selecionarClienteDaVenda(ArrayList<Cliente> listaDeClientes ) {

		String msg = listaDeClientes + "\nDigite o telefone do cliente da compra:";
		String telefoneEscolhido = JOptionPane.showInputDialog(msg);
		Cliente cliente = null;
		for (Cliente clienteUnico : listaDeClientes) {
			if (clienteUnico.telefone.equals(telefoneEscolhido)) {
				cliente = clienteUnico;
			}
		}
		this.cliente = cliente;
	}
	
	public void selecionarProdutosDaVenda(ArrayList<Produto> listaDeProdutos) {
		ArrayList<Produto> listaTemporariaProdutos = new ArrayList<Produto>();
		String msg = listaDeProdutos + "\nDigite o codigo do produto ou 0 para sair:";
		int codigoEscolhido;
		do {
			 codigoEscolhido = Integer.parseInt(JOptionPane.showInputDialog(msg));
		
			 for(Produto produtoUnico: listaDeProdutos) {
				 if (produtoUnico.codigo == codigoEscolhido) {
					 listaTemporariaProdutos.add(produtoUnico); 
				 }
			 }
		}while(codigoEscolhido != 0);
		this.listaDeProdutos = listaTemporariaProdutos;
	}
	
	
	
	@Override
	public String toString() {
		return "Venda [codVenda=" + codVenda + ", dataVenda=" + dataVenda + ", valorVenda=" + valorVenda + ", cliente="
				+ cliente + ", listaDeProdutos=" + listaDeProdutos + "]";
	}
	
	
	
}
