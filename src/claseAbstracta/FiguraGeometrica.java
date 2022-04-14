package claseAbstracta;

public abstract class FiguraGeometrica {

	public String tipoGeometrico;
	
	public FiguraGeometrica(String tipoGeometrico) {
		this.tipoGeometrico = tipoGeometrico;
	}

	public abstract void dibujar();
	
}
