package practicasemanalsemana3;

import java.util.Scanner;

public class Ejercicio2semana3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("ingrese la cantidad de alumnos");
		int cantidadAlumnos = teclado.nextInt();
		
		String nombre;
		String apellido;
		int cantidadExamenes;
		float [] calificaciones;
		
		String alumnos = new String {nombre,apellido,cantidadExamenes,calificaciones[]};
		
		float promedio = 0;
		float calificacion = 0;
		
		for(int i = 0; i < alumnos.length; i++) {
			System.out.println("ingrese el nombre del alumno");
			alumnos[i] = teclado.next();
		
		float a = 1;
		float calificaciones = 0;
		
		System.out.println("ingrese la cantidad de examenes");
		float cantidadExamenes = teclado.nextFloat();
		
		while(a <= cantidadExamenes) {
			System.out.println("ingrese la calificacion numero: " + a);
			calificacion = teclado.nextFloat();
			calificaciones += calificacion;
			a++;
		promedio = calificaciones / cantidadExamenes;
		}
		}
		float mayorPromedio; 
		float menorPromedio;
		mayorPromedio = menorPromedio = promedio;
		for(int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] > mayorPromedio) {
				mayorPromedio = alumnos[i];
			System.out.println("el menor promedio fue" + menorPromedio + " y fue de " + alumnos[i]);
		}
			if(alumnos[i] < menorPromedio) {
			System.out.println("el mayor promedio fue" + mayorPromedio + " y fue de " + alumnos[i]);
		}
		}
		mayor(calificacion);
	}
		
		public static void promedio(String [] alumnos, float promedio) {
		for (int j = 0; j < alumnos.length; j++) {
			float promedioActual = promedio;
			float mayorPromedio = 0;
			float menorPromedio = 0;
			String alumno = null;
			if (promedioActual >= promedio) {
				mayorPromedio = promedioActual;
				alumno = alumnos[j];
			}
			if(promedioActual < promedio) {
				menorPromedio = promedioActual;
				alumno = alumnos[j];
			}	
			System.out.println("el mayor promedio fue" + mayorPromedio + " y fue de " + alumno);
			System.out.println("el menor promedio fue" + menorPromedio + " y fue de " + alumno);
		
		}
		}
		
		public static void mayor(float calificacion){
		for(int k = 0; k < calificacion; k++) {
			float mayor, menor;
			mayor = menor = calificacion;
	
			if(calificacion > mayor) {
				mayor = calificacion;
			}
			if(calificacion < menor) {
				menor = calificacion;
			}
			System.out.println("la mayor calificacion es: " + mayor);
			System.out.println("la menor calificacion es: " + menor);
}
	
		}
	

}
