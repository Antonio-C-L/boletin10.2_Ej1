package clases;

public class Circulo extends FigurasGeometricas{
	private double radio;

	
	
	public double getRadio() {
		return radio;
	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.exp(getRadio());
	}

	@Override
	public String toString() {
		return "Figura: "+getClass().getSimpleName()+"\nRadio: "+getRadio()+"\nArea: "+getArea();
	}
	
	
}
