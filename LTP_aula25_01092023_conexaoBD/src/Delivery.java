
public class Delivery {
	private int codigo;
	private String endereco;
	private Produto codigoProduto;
	
	public Delivery() {}
	
	
	public Delivery(int codigo, String endereco, Produto codigoProduto) {
		super();
		this.codigo = codigo;
		this.endereco = endereco;
		this.codigoProduto = codigoProduto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Produto getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(Produto codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	
	
	
	
	
}
