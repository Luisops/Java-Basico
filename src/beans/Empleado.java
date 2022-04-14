package beans;

public class Empleado {
//COMENTARIO DE PRUEBA PARA SUBIR EN EL GIT
	protected String nombre;
	protected String apellido;
	protected int sueldo;
	
	public Empleado(String nombre, String apellido, int sueldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
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

	public int getNivel() {
		return sueldo;
	}

	public void setNivel(int nivel) {
		this.sueldo = nivel;
	}
	
	public String mostrarDetalles() {
		return "Nombre: "+this.nombre+", Apellido: "+this.apellido+", Sueldo: "+this.sueldo;
	}
	
}
