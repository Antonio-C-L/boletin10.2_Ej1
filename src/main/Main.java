package main;

import clases.Cuadrado;
import clases.CuadradoEspecializado;
import clases.FigurasGeometricas;
import clases.Rectangulo;

public class Main {

	public static void main(String[] args) {
		FigurasGeometricas rectangulo=new Rectangulo(1, 2);
		System.out.println(rectangulo.toString());
		
		
		CuadradoEspecializado cuadradoEspecializado=new CuadradoEspecializado(2, 2);
		System.out.println(cuadradoEspecializado.pintarCuadradoEspecializado());
		
		
	}

}
