import java.util.ArrayList;

public class Region {
	private String nombre;
	private ArrayList<Ciudad> ciudades;

	public Region(String nombre) {
		this.nombre = nombre;
		this.ciudades = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarCiudad(String nombre, int codigoPostal) {
		Ciudad nuevaCiudad = new Ciudad(nombre,codigoPostal);
		this.ciudades.add(nuevaCiudad);
		System.out.println("Ciudad agregada con exito.");
	}

	public void eliminarCiudad(String nombreCiudad) {
		for (Ciudad ciudad : this.ciudades) {
			if (ciudad.getNombre().equals(nombreCiudad)) {
				this.ciudades.remove(ciudad);
			}
		}
	}

	public String toString() {
		return "Nombre: " + this.nombre + "\nCiudades: " + this.ciudades;
	}
}