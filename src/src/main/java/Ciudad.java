import java.util.ArrayList;

public class Ciudad {

	private String nombre;
	private int codigoPostal;
	private ArrayList<Tienda> tiendas;

	public Ciudad(String nombre, int codigoPostal) {
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
		this.tiendas = tiendas;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public void agregarTienda(String nombre, String direccion, String horarioAtencion) {
		Tienda tiendaNueva = new Tienda(nombre, direccion, horarioAtencion);
		this.tiendas.add(tiendaNueva);
		System.out.println("Tienda agregada correctamente.");
	}

	public void eliminarTienda(String direccion) {
		for (Tienda tienda : this.tiendas) {
			if (tienda.getDireccion().equals(direccion)) {
				this.tiendas.remove(tienda);
			}
		}
	}

	public void mostrarTiendas() {
		for (Tienda tienda : this.tiendas) {
			tienda.mostrarDatosTienda();
		}
	}

	public String toString() {
		return "Nombre: " + this.nombre+"\n"+ "CodigoPostal: " + this.codigoPostal + "\n";
	}
}