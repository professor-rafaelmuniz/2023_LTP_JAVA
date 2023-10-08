
public class Produto {
	private int codigo;
	private String nome;
	private float valor;
	private int qtd;
	
	
	
	
	
	
	
	public Produto(int codigo, String nome, float valor, int qtd) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.qtd = qtd;
	}
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
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
	
	
}
