package practicasemanalsemana3;

import java.util.Scanner;

public class Intento1Ejercicio2 {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("elija la cantidad de alumnos");
		int cantidadAlumnos = teclado.nextInt();
		
		Alumno nuevoAlumno = new Alumno(cantidadAlumnos);
		
		
		float primerNota;
		float segundaNota;
		float tercerNota;
				
		
		System.out.println("Ingrese primer nota:");
		primerNota = teclado.nextFloat();
		
		System.out.println("Ingrese segunda nota:");
		segundaNota = teclado.nextFloat();
		
		System.out.println("Ingrese tercer nota:");
		tercerNota = teclado.nextFloat();
		
		
		
	}

}
