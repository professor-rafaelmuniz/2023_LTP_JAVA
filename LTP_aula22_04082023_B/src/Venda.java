import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Venda {
	Date data;
	int codigo;
	Cliente cliente;
	ArrayList<Produto> listaProduto;
	float valorFinal;
	
	Venda(int codigoVenda){
		listaProduto = new ArrayList<Produto>();
		data = Calendar.getInstance().getTime();
		this.codigo = codigoVenda;
		this.valorFinal = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da venda:"));
	}

	public void selecionarClienteDaVenda(ArrayList<Cliente> listaClientes) {
		String prontuarioSelecionado = JOptionPane.showInputDialog(listaClientes + "\n\nDigite o prontuario: ");
		for (Cliente clienteTemp : listaClientes) {
			if (clienteTemp.getProntuario().equals(prontuarioSelecionado)) {
				this.cliente = clienteTemp;
			
			}
		}
	}
	
	public void selecionarProdutosDaVenda(ArrayList<Produto> listaProdutos) {
		
		ArrayList<Produto> listaProdutosDaVenda = new ArrayList<Produto>();
		int codSelecionado;
		do {
			codSelecionado = Integer.parseInt(JOptionPane.showInputDialog(listaProdutos + "\n\nDigite o codigo do produto ou 0 para sair: "));
			for (Produto produtoTemp : listaProdutos) {
				if (codSelecionado == produtoTemp.getCodigo()) {
					listaProdutosDaVenda.add(produtoTemp);
				}
			}
		}while(codSelecionado != 0);
	
		this.listaProduto = listaProdutosDaVenda;
	}
	
	
	@Override
	public String toString() {
		return "Venda [data=" + data + ", codigo=" + codigo + ", cliente=" + cliente + ", listaProduto=" + listaProduto
				+ ", valorFinal=" + valorFinal + "]";
	}


	
	
}
