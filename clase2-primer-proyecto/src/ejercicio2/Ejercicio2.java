package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
			
			float calificaciones[];
			String[] alumnos;
			int cantidadAlumnos;
			float[] promedio;
			
			System.out.println("ingrese la cantidad de alumnos que hay");
			cantidadAlumnos = teclado.nextInt();
			
			calificaciones = new float[cantidadAlumnos];
			alumnos = new String[cantidadAlumnos];
			promedio = new float[cantidadAlumnos];
			
			
			inicializar(calificaciones, alumnos, teclado);
			promedio(calificaciones, promedio, alumnos);//tengo problemas con este.
			mayor(calificaciones, alumnos);
			
		}
		public static void inicializar(float calificaciones[], String alumnos[], Scanner teclado) 
		{
			for (int i=0; i<calificaciones.length; i++)
			{
				System.out.println("Nombre del alumno");
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
			
			for(float aux : promedio)
			
			if(promedio.length > 0) {
				for (int i = 1; i < alumnos.length; i++) {
					
					if (promedio[i] <= 7) {
						System.out.println("el promedio del alumno: " + alumnos[i] + " es mayor o igual a 7 por lo que promociona la materia");
					}else {
						System.out.println("el promedio del alumno: " + alumnos[i] + " es menor a 7 por lo que recursa la materia");
						
					}	
				}
				
			}
			
		}
		
		public static void mayor (float calificaciones[], String alumnos[])
		{
			for(float aux : calificaciones )
			
			if(calificaciones.length > 0) {
				float mayor = calificaciones[0];
				float menor = calificaciones[0];
				for (int i = 1; i < calificaciones.length; i++) {
					float calificacionActual = calificaciones[i];
					if (calificacionActual > calificaciones[i]) {
						mayor = calificacionActual;
					}
					if(calificacionActual <= calificaciones[i]) {
						menor = calificacionActual;
					}	
				System.out.println("la calificacion mas alta fue " + mayor + " y fue de " + alumnos[i]);
				System.out.println("la calificacion mas baja fue " + menor + " y fue de " + alumnos[i]);
				}
				
			}
		}

	}