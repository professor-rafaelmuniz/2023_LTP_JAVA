package modelos;

import javax.swing.JOptionPane;

public class Produto {
	int codigo;
	String nome; 
	double preco;
	int qtdEstoque;
	
	Produto(int codigoProduto){
		this.codigo 	= codigoProduto;
		this.nome 		= JOptionPane.showInputDialog("Digite o nome do produto:");
		this.preco 		= Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
		this.qtdEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd do produto no estoque:"));
	}

	@Override
	public String toString() {
		return "\nProduto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", qtdEstoque=" + qtdEstoque + "]";
	}
	
}
