import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Evento {
	String nome;
	String data;// Utilizar classe específica para data
	String local;
	Float valor;
	ArrayList<Atracao>listaAtracoes;
	
	Evento(){
		listaAtracoes = new ArrayList<Atracao>();
		this.nome = JOptionPane.showInputDialog("Digite o nome do evento:");
		this.local = JOptionPane.showInputDialog("Digite o local do evento:");
		this.data = JOptionPane.showInputDialog("Digite a data do evento:");
		this.valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do ingresso:"));
	}


	@Override
	public String toString() {
		return "Evento [nome=" + nome + ", data=" + data + ", local=" + local + ", valor=" + valor + ", \natracao="
				+ listaAtracoes + "]";
	}
	
	
	
	
}
