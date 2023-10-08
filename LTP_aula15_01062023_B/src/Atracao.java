import javax.swing.JOptionPane;

public class Atracao {
	String nome;
	String horario;
	Float cache;
	
	Atracao(){
		this.nome = JOptionPane.showInputDialog("Digite o nome da atração:");
		this.horario = JOptionPane.showInputDialog("Digite o horário da apresentação:");;
		this.cache = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do cachê:"));;
	}

	@Override
	public String toString() {
		return "Atracao [nome=" + nome + ", horario=" + horario + ", cache=" + cache + "]";
	}
	
	
	
}
