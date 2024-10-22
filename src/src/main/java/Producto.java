public class Producto {
	private String nombre;
	private int codigoProducto;
	private String descripcion;
	private int precio;
	private String categoria;
	private int existencias;


	public Producto(String nombre, int codigoProducto, String descripcion, int precio, String categoria, int existencias) {
		this.nombre = nombre;
		this.codigoProducto = codigoProducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.categoria = categoria;
		this.existencias = existencias;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCodigoProducto() {
		return this.codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getExistencias() {
		return this.existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	public void mostrarProducto() {
		System.out.println("Producto: " + nombre);
		System.out.println("Código: " + codigoProducto);
		System.out.println("Descripción: " + descripcion);
		System.out.println("Precio: " + precio);
		System.out.println("Categoría: " + categoria);
		System.out.println("Existencias: " + existencias);
	}
}