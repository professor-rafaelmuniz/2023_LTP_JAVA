import javax.swing.JOptionPane;

public class Produto {
	private int codigo;
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	private String nome;
	private float preco;
	private int qtdEstoque;
	private String tipo;
	
	Produto(int codigoProduto){
		this.codigo = codigoProduto;
		this.nome = JOptionPane.showInputDialog("Digite o nome do produto:");
		this.preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do produto:"));
		this.tipo = JOptionPane.showInputDialog("Digite o tipo do produto:");
		this.qtdEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd de estoque produto:"));
	}

	@Override
	public String toString() {
		return "\nProduto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", qtdEstoque=" + qtdEstoque
				+ ", tipo=" + tipo + "]";
	}
	
	
}

