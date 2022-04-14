package claseAbstracta;

public class Rectangulo extends FiguraGeometrica{

	public Rectangulo(String tipoGeometrico) {
		super(tipoGeometrico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("Aqui dibujas un:"+this.getClass().getSimpleName());
	}

}
