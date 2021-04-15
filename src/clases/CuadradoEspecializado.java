package clases;

import java.util.Iterator;

public class CuadradoEspecializado extends Cuadrado{

	public static final String CARACTER="* ";
	public static final String SALTO="\n";

	double lado=5;
	
	
	
	public CuadradoEspecializado(double lado1, double lado2) {
		super(lado1, lado2);
	}

	public String pintarCuadradoEspecializado() {
		String string="";
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				string+=CARACTER;
			}
			string+=SALTO;
		}
		return string;
	}
	
	
	
}
