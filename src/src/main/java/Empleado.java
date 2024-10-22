public class Empleado {
	private String nombre;
	private int nIdentificacion;
	private String cargo;

	public Empleado(String nombre, int nIdentificacion, String cargo) {
		this.nombre = nombre;
		this.nIdentificacion = nIdentificacion;
		this.cargo = cargo;
	}

	public int getNIdentificacion() {
		return this.nIdentificacion;
	}

	public void setNIdentificacion(int nIdentificacion) {
		this.nIdentificacion = nIdentificacion;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void obtenerDatosEmpleado() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Numero de Identificacion: " + nIdentificacion);
		System.out.println("Cargo: " + cargo);
	}
}