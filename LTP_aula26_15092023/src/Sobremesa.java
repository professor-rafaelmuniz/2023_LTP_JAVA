import javax.swing.JOptionPane;

public class Sobremesa {
	private String nome;
	private float preco;

	
	// ENCAPSULAMENTO
	// SET -> Enviar um valor
	// GET -> Pegar um valor
	
	Sobremesa(){
		
	}
	
	
	public void setPreco(float preco) {
		if (preco > 0.0) {
			this.preco = preco;
		}else {
			JOptionPane.showMessageDialog(null, "Preço invalido");
		}
	}
	
	public float getPreco() {
		return this.preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Sobremesa [nome=" + nome + ", preco=" + preco + "]";
	}
	
	
	
	
	
	
}
