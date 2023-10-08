import javax.swing.JOptionPane;

public class Caminhao {
	
	String placa;
	String tipo;
	Float peso;
	Motorista motorista;
	
	Caminhao(int codigoCaminhao){
		if (codigoCaminhao == 1) {
			this.tipo = "Toco";
		}else if(codigoCaminhao == 2) {
			this.tipo = "Truck";
		}else if (codigoCaminhao == 3) {
			this.tipo = "3/4";
		}else if (codigoCaminhao == 4) {
			this.tipo = "5 Eixos";
		}
		
	}

	@Override
	public String toString() {
		return "Caminhao [placa=" + placa + ", tipo=" + tipo + ", peso=" + peso + ", motorista=" + motorista + "]";
	}
	
	
	public void cadastrarNovoCaminhao() {
		this.placa = JOptionPane.showInputDialog("Digite a placa do caminhao:");
		this.peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do caminhao:"));
	}
	
	public void associarMotoristaNoCaminhao(Motorista motorista) {
		this.motorista = motorista;
	}
	
	
	
}
