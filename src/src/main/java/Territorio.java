import java.util.ArrayList;

public class Territorio {
	private String nombre;
	private ArrayList<Region> regiones;

	public Territorio(String nombre) {
		this.nombre = nombre;
		this.regiones = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarRegion(String nombre) {
		Region regionNueva = new Region(nombre);
		this.regiones.add(regionNueva);
		System.out.println("Se a agregado la region correctamente.");
	}

	private Region buscarRegion(String nombre) {
		for (Region region : this.regiones) {
			if (region.getNombre().equals(nombre)) {
				return region;
			}
		}return null;
	}

	public void agregarCiudadARegion(String nombreRegion, String nombreCiudad, int codigoPostal) {
		Region region = buscarRegion(nombreRegion);
		if (region != null) {
			region.agregarCiudad(nombreCiudad, codigoPostal);
		}
	}

	public void eliminarRegion(String nombreRegion) {
		for (Region region : this.regiones) {
			if (region.getNombre().equals(nombreRegion)) {
				this.regiones.remove(region);
			}
		}
	}

	public void modificarRegion(Region region, String nombreNuevo) {
		throw new UnsupportedOperationException();
	}

	public void mostrarRegionesYCiudades() {
		for (Region region : this.regiones) {
			System.out.println(region.toString());
		}
	}
}