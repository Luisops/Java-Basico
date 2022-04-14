package claseInterface;

public class ImplementacionMYSQL implements AccesoDatos{

	@Override
	public void insertar() {
		System.out.println("INSERTAR DATOS DE MYSQL");
		
	}

	@Override
	public void listar() {
		System.out.println("LISTAR DATOS DE MYSQL");
		
	}

}
