import javax.swing.JOptionPane;

public class Eleitor {
	/////////////////////////////
	// ATRIBUTOS
	private String cpf;
	private String nome;
	private int idade;
	
	
	////////////////////////////////
	// CONSTRUTOR
	public Eleitor() {
		this.cpf = JOptionPane.showInputDialog("Digite o cpf:");
		this.nome = JOptionPane.showInputDialog("Digite o nome:");
		//int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
		
		if (idade >= 16) {
			this.idade = idade;
		}else {
		//	JOptionPane.showMessageDialog(null, "Idade inválida");
		}
		
	}
	
	
	///////////////////////////////////
	// METODOS
	public void setCpf(String cpf) {// Metodo para inserir/alterar dado
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setIdade(int idade) {
		if (idade >= 16) {
			this.idade = idade;
		}else {
			JOptionPane.showMessageDialog(null, "Idade inválida");
		}
	}
	public int getIdade() {
		return this.idade;
	}
	
	

	@Override
	public String toString() {
		return "Eleitor [cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + "]";
	}
	
	
	
}
