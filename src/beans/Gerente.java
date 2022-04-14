package beans;

public class Gerente extends Empleado{

	private String departamento;
	
	public Gerente(String nombre, String apellido, int sueldo, String departamento) {
		super(nombre, apellido, sueldo);
		// TODO Auto-generated constructor stub
		this.departamento=departamento;
	}

	public String mostrarDetalles() {
		return super.mostrarDetalles()+", Departamento: "+this.departamento;
	}
	
}
