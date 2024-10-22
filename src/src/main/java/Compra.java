import java.util.ArrayList;
import java.util.Date;

public class Compra {
	private int nCompra;
	private Date fechaCompra;
	private String medioDePago;
	private ArrayList<Producto> productos;
	private Cliente cliente;

	public Compra(int nCompra, Date fechaCompra, String medioDePago, Cliente cliente) {
		this.nCompra = nCompra;
		this.fechaCompra = fechaCompra;
		this.medioDePago = medioDePago;
		this.cliente = cliente;
		this.productos = new ArrayList<>();
	}

	public int getNCompra() {
		return this.nCompra;
	}

	public void setNCompra(int nCompra) {
		this.nCompra = nCompra;
	}

	public Date getFechaCompra() {
		return this.fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getMedioDePago() {
		return this.medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
		System.out.println("Producto agregado correctamente.");
	}
}