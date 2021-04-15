package clases;

public class Rectangulo extends FigurasGeometricas{
	private double base;
	private double altura;
	
		
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getLado1() {
		return base;
	}

	public double getLado2() {
		return altura;
	}

		@Override
	public double getArea() {
		return base*altura;
	}

		@Override
		public String toString() {
			return "Figura: "+getClass().getSimpleName()+"\nBase: "+getLado1()+"\nAltura: "+getLado2();
		}
	
	
}
