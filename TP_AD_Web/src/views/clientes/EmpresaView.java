package views.clientes;

import java.util.List;

import views.productos.ProductoView;

public class EmpresaView {

	private int id;
	private String nombre;
	private boolean esRegular;
	private List<ProductoView> productos;
	private CuentaCorrienteView cuentaCorriente;

	public EmpresaView() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEsRegular() {
		return esRegular;
	}

	public void setEsRegular(boolean esRegular) {
		this.esRegular = esRegular;
	}

	public List<ProductoView> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoView> productos) {
		this.productos = productos;
	}

	public CuentaCorrienteView getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(CuentaCorrienteView cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

	
}