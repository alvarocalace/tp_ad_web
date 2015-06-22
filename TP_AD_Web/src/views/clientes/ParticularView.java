package views.clientes;

import java.util.ArrayList;
import java.util.List;

public class ParticularView {

	private int id;
	private String dni;
	private String nombre;
	private String apellido;
	private List<ReceptorView> receptores = new ArrayList<ReceptorView>();

	public ParticularView() {
		
	}
	
	public ParticularView(int id, String dni, String nombre, String apellido) {
		
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<ReceptorView> getReceptores() {
		return receptores;
	}

	public void setReceptores(List<ReceptorView> receptores) {
		this.receptores = receptores;
	}

	
}
