package clases;

public class Triangulo extends FigurasGeometricas{
	private double base;
	private double altura;
	
		public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public double getArea() {
		return base*altura/2;
	}

	@Override
	public String toString() {
		return "Figura: "+getClass().getSimpleName()+"\nBase: "+getBase()+"\nAltura: "+getAltura()+"\nArea: "+getArea();
	}
	
	
}
