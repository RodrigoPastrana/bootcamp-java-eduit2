package practicasemanalsemana3;

import java.util.Scanner;

public class Ejercicio2Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
			float notas[];
			String alumnos[];
			int cantidadAlumnos;
			float promedio;
		
				System.out.println("ingrese la cantidad de alumnos que hay");
				cantidadAlumnos = teclado.nextInt();
		
			notas = new float[cantidadAlumnos];
			alumnos = new String[cantidadAlumnos];
		
		for(int i=0;i<cantidadAlumnos;i++) {

	            System.out.println("nombre del alumno?");
	            alumnos = teclado.next();

	            System.out.println("apellido del alumno");
	            alumnos = teclado.next();

	            int numeroExamen;
	            int suma = 0;
	            int prom = 0;

	            System.out.print("ingrese cantidad de notas:");
	            numeroExamen = teclado.nextInt();

	            for(int j=1; j<= numeroExamen; j++){
	                System.out.println("ingrese nota"+" "+j+" "+"de"+" "+numeroExamen+":");
	                int notaAlumnoExamen = teclado.nextInt();
	                suma = suma + notaAlumnoExamen;
	            }
	                prom= suma /numeroExamen;
	                System.out.println("promedio de las notas:"+prom );

	                if(prom >= 7) {
	                    System.out.println("Este alumno a promocionado");
	                }else {
	                    System.out.println("Este alumno debe recursar la materia");
	                }
	                

	        }
	        
	            teclado.close();
			}
	public static void inicializar(float calificaciones[], String alumnos[], Scanner teclado) 
	{
		for (int i=0; i<calificaciones.length; i++)
		{
			System.out.println("Nombre del alumno");
			alumnos[i] = teclado.next();
			System.out.println("ingrese la calificacion");
			calificaciones[i] = teclado.nextFloat();
		}
	}
	
	
	public static float promedio(float calificaciones[])
	{
		float prom, suma = 0;
		for(int i = 0; i < calificaciones.length; i++)
		suma += calificaciones[i];
		prom = suma/calificaciones.length;
		return prom;
	}
	
	
			
}
		
		

		
		
	


