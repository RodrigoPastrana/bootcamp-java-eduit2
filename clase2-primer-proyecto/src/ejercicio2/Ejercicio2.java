package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		float calificaciones[];
		String alumnos[];
		int cantidadAlumnos;
		float[] promedio;
		
		System.out.println("ingrese la cantidad de alumnos que hay");
		cantidadAlumnos = teclado.nextInt();
		
		calificaciones = new float[cantidadAlumnos];
		alumnos = new String[cantidadAlumnos];
		promedio = new float[cantidadAlumnos];
		
		
		inicializar(calificaciones, alumnos, teclado);
		promedio(calificaciones, promedio, alumnos);
		mayor(calificaciones, alumnos);
		
	}
	public static void inicializar(float calificaciones[], String alumnos[], Scanner teclado) 
	{
		for (int i=0; i<calificaciones.length; i++)
		{
			System.out.println("Nombre del alumnos");
			alumnos[i] = teclado.next();
			
			int numeroExamenes;
			
			System.out.println("ingrese la cantidad de examenes");
			numeroExamenes = teclado.nextInt();
			for(int j=0; j< numeroExamenes; j++){
				System.out.println("ingrese notas");
				calificaciones[i] = teclado.nextFloat();
			}
		}
	}
	
	public static void promedio(float calificaciones[], float promedio[], String alumnos[])
	{
		float suma = 0;
		for(int i = 0; i < calificaciones.length; i++) {
			suma = suma + calificaciones[i];
			promedio[i] = suma/calificaciones.length;}
		
		if(promedio.length > 0) {
			float mayorPromedio = promedio[0];
			float menorPromedio = promedio[0];
			String alumno = null;
			for (int i = 1; i < promedio.length; i++) {
				
				if (promedio[i] > mayorPromedio) {
					mayorPromedio = promedio[i];
					alumno = alumnos[i];
				}
				if(promedio[i] < menorPromedio) {
					menorPromedio = promedio[i];
					alumno = alumnos[i];
				}	
			}
			System.out.println("el mayor promedio fue" +mayorPromedio + "y fue de " + alumno);
			System.out.println("el menor promedio fue" +menorPromedio + "y fue de " + alumno);
			
		}
		
	}
	
	public static void mayor (float calificaciones[], String alumnos[])
	{
		if(calificaciones.length > 0) {
			float mayor = calificaciones[0];
			float menor = calificaciones[0];
			String alumno = null;
			for (int i = 1; i < calificaciones.length; i++) {
				
				if (calificaciones[i] > mayor) {
					mayor = calificaciones[i];
					alumno = alumnos[i];
				}
				if(calificaciones[i] <= menor) {
					menor = calificaciones[i];
					alumno = alumnos[i];
				}	
			}
			System.out.println("la calificacion mas alta fue" +mayor + "y fue de " + alumno);
			System.out.println("la calificacion mas baja fue" +menor + "y fue de " + alumno);
			
		}
	}

}

