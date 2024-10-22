public class Cliente {
	private String nombre;
	private int nCliente;

	public Cliente(String nombre, int nCliente) {
		this.nombre = nombre;
		this.nCliente = nCliente;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNCliente() {
		return this.nCliente;
	}

	public void setNCliente(int nCliente) {
		this.nCliente = nCliente;
	}
}