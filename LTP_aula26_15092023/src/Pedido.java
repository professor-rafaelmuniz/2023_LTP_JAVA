import java.util.ArrayList;

public class Pedido {
	
	private int codigo;
	private ArrayList<Sobremesa> listaSobremesa;
	private Cliente cliente;
	
	
	
	Pedido(){
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public ArrayList<Sobremesa> getListaSobremesa() {
		return listaSobremesa;
	}
	public void setListaSobremesa(ArrayList<Sobremesa> listaSobremesa) {
		this.listaSobremesa = listaSobremesa;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", listaSobremesa=" + listaSobremesa + "]";
	}
	
	
	
	
}
