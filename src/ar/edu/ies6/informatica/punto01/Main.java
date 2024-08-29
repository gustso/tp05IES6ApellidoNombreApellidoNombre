package ar.edu.ies6.informatica.punto01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables y tipos de datos
		int numeroA = 30;
		int numeroE = -6;
		long numeroB = 45789789;
		float numeroC = 5.6f;
		double numeroD = 6.4;
		char caracter = '?';
		boolean bandera = true;
		int numeroF = 10;
		
		//operadores
		int modulo = numeroA % numeroE;
		System.out.println("El resto de la división es: "+modulo);
		
		double suma = numeroA + numeroD;		
		System.out.println("El resultado de la suma es: "+suma);
		
		double promedio = (numeroA + numeroE + numeroD + numeroC)/4;		
		System.out.println("El resultado del promedio es: "+promedio);
		
		//estructuras de control
		//if
		if (numeroF == 0) {
			System.out.println("NO SE PUEDE DIVIDIR POR CERO");
		} else {
			int division = numeroA / numeroF;		
			System.out.println("El resultado de la division es: "+division);	
		};
		
		//Clase Math
		double numeroG = Math.random()*100;
		double numeroH = Math.max(numeroA, numeroB);
		System.out.println("el mayor de los números es: "+numeroH+" y el numero aleatorio es "+numeroG);
		
		//ingreso de datos por consola
		Scanner scanner = new Scanner(System.in);
		
		long factorial = 15;
		System.out.println("Ingrese numero :");
			
		if(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			factorial=factorial*num;	
			System.out.println("el numero resultado es "+factorial);
		}
		else {
			System.out.println("Se ingresó datos incorrectos");
		}
	}
}
