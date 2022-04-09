package practicasemanalsemana3;

import java.util.Scanner;

public class IntentoBueno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float notas[];
		String alumnos[];
		int cantidadAlumnos;
		float promedio[];
	
			System.out.println("ingrese la cantidad de alumnos que hay");
			cantidadAlumnos = teclado.nextInt();
	
		notas = new float[cantidadAlumnos];
		alumnos = new String[cantidadAlumnos];
		
		inicializar(notas, alumnos, teclado);
		mejorPromedio(notas, alumnos);
	}
	
	public static void inicializar(float notas[], String alumnos[], Scanner teclado) 
	{
		for (int i=0; i<notas.length; i++)
		{
			System.out.println("Nombre del alumno");
			alumnos[i] = teclado.next();
			
			int numeroExamenes;
            int suma = 0;
            int prom = 0;
            
            System.out.print("ingrese cantidad de notas:");
            numeroExamenes = teclado.nextInt();

            for(int j=1; j<= numeroExamenes; j++){
                System.out.println("ingrese nota"+" "+j+" "+"de"+" "+numeroExamenes+":");
                int notaAlumnoExamen = teclado.nextInt();
                suma = suma + notaAlumnoExamen;
            }
                prom= suma /numeroExamenes;
                System.out.println("promedio de las notas:"+prom );
		}
	}
	
	
	public static void mejorPromedio(float notas[], String alumnos[])
	{
		if(notas.length > 0) {
			
			float mayor = notas [0];
			float menor = notas [0];
			String alumno;
			
			for (int i = 1; i < notas.length; i++)
				if (notas[i] > mayor) {
					mayor = notas[i];
					alumno = alumnos[i];
					System.out.println("la calificacion mas alta fue" +mayor + "y fue de " + alumno);
				}else {
					if (notas[i] < menor) {
						menor = notas[i];
						alumno = alumnos[i];
						System.out.println("la calificacion mas baja fue" +menor + "y fue de " + alumno);
					}
				}
		}else {
			System.out.println("no hay notas para ver");
		}
			
	}
	
	
			
}