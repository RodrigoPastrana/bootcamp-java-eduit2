package practicasemanalsemana3;

import java.util.Scanner;

public class ElVerdaderoIntento {

	public static void inicializar(float calificaciones[], String alumnos[], Scanner teclado) 
	{
		for (int i=0; i<calificaciones.length; i++)
		{
			System.out.println("Nombre del alumnos");
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
	
	public static float imprimir(float calificaciones[], String alumnos[], float promedio)
	{
		System.out.printf("alumnos", "calificacion");
		for(int i = 0; i < calificaciones.length; i++)
		{
			System.out.println("alumnos[i], calificaciones[i]");
		}
		System.out.println("el promedio grupal es" + promedio);
		return promedio;
	}
	
	public static void mayor (float calificaciones[], String alumnos[])
	{
		float mayor = 0;
		String alumno;
		for (int i = 0; i < calificaciones.length; i++)
		
			if (calificaciones[i] > mayor) {
				mayor = calificaciones[i];
				alumno = alumnos[i];
			System.out.println("la calificacion mas alta fue" +mayor + "y fue de " + alumno);
		}
			
	}
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		float calificaciones[];
		String alumnos[];
		int n;
		float promedio;
		
		System.out.println("ingrese la cantidad de alumnos que hay");
		n = teclado.nextInt();
		
		calificaciones = new float[n];
		alumnos = new String[n];
		
		
		inicializar(calificaciones, alumnos, teclado);
		promedio = promedio(calificaciones);
		imprimir(calificaciones, alumnos, promedio);
		mayor(calificaciones, alumnos);
		
	}

}
