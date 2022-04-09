package practicasemanalsemana3;

import java.util.Scanner;

public class Intento2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        System.out.println("elija la cantidad de alumnos");
        int cantidadAlumnos = teclado.nextInt();



        for(int i=0;i<cantidadAlumnos;i++) {

            System.out.println("nombre del alumno?");
            String nombre = teclado.next();

            System.out.println("apellido del alumno");
            String apellido = teclado.next();

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

}
