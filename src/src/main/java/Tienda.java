import java.util.ArrayList;
import java.util.Date;

public class Tienda {
	private String nombre;
	private String direccion;
	private String horarioAtencion;
	private ArrayList<Empleado> empleados;
	public ArrayList<Producto> productos;
	private ArrayList<Compra> compras;

	public Tienda(String nombre, String direccion, String horarioAtencion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.horarioAtencion = horarioAtencion;
		this.empleados = new ArrayList<>();
		this.productos = new ArrayList<>();
		this.compras = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHorarioAtencion() {
		return this.horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public void agregarEmpleado(String nombre, int nIdentificacion, String cargo) {
		Empleado empleadoNuevo = new Empleado(nombre, nIdentificacion, cargo);
		this.empleados.add(empleadoNuevo);
		System.out.println("Empleado agregado correctamente.");
	}

	public void modificarEmpleado(Empleado empleado) {
		throw new UnsupportedOperationException();
	}

	public void eliminarEmpleado(Empleado empleado) {
		this.empleados.remove(empleado);
		System.out.println("Empleado eliminado correctamente.");
	}

	public void mostrarEmpleadosTienda() {
		for (Empleado empleado : this.empleados) {
			empleado.obtenerDatosEmpleado();
		}
	}

	public void registarCompra(int nCompra, Date fechaCompra, String medioPago, Cliente cliente) {
		Compra compra = new Compra(nCompra, fechaCompra, medioPago, cliente);
		this.compras.add(compra);
		System.out.println("Compra agregada correctamente");
	}

	public void registrarProducto(String nombre, int codigoProducto, String descripcion, int precio, String categoria, int existencias) {
		Producto nuevoProducto = new Producto(nombre, codigoProducto, descripcion, precio, categoria, existencias);
		this.productos.add(nuevoProducto);
		System.out.println("Producto añadido correctamente.");
	}
	public void modificarProducto() {
		throw new UnsupportedOperationException();
	}

	public void eliminarProducto(String nombreProducto) {
		for (Producto producto : this.productos) {
			if (nombreProducto.equals(producto.getNombre())){
				this.productos.remove(producto);
			}
		}

	}

	public void mostrarProductosDisponibles() {
		for (Producto producto : productos) {
			if (producto.getExistencias() > 0){
				System.out.println("Productos disponibles: ");
				System.out.println("------------");
				producto.mostrarProducto();

			}
		}
	}

	public Cliente registrarCliente(String nombre, int nCliente) {
		Cliente clienteNuevo = new Cliente(nombre, nCliente);
		return clienteNuevo;
	}

	public void mostrarDatosTienda(){
		System.out.println("Datos de tienda:");
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccion: " + direccion);
		System.out.println("Horario atencion: " + horarioAtencion);
	}
}