package claseAbstracta;

public class Cuadrado extends FiguraGeometrica{

	
	public Cuadrado(String tipoGeometrico) {
		super(tipoGeometrico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dibujar() {
		System.out.println("Aqui dibujas un:"+this.getClass().getSimpleName());
		
	}

}
