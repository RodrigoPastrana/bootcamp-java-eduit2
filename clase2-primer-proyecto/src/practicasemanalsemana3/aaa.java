package practicasemanalsemana3;

import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int cantidadAlumnos;
		String nombre;
		String apellido;
		int numeroExamenes;
		float calificaciones;
		float suma = 0, mayor, menor;
		
		do {
		System.out.println("ingrese la cantidad de alumnos que hay");
		cantidadAlumnos = teclado.nextInt();
		} while (cantidadAlumnos <= 0);
		
		for (int i=0; i<cantidadAlumnos; i++)
		{
			System.out.println("Nombre del alumno");
			nombre = teclado.next();
			
			System.out.println("apellido del alumno");
			apellido = teclado.next();			
			
			do {
			System.out.println("ingrese la cantidad de examenes");
			numeroExamenes = teclado.nextInt();
			} while (numeroExamenes <= 0);
			
			for(int j=0; j< numeroExamenes; j++){
			System.out.print("calificaciones del alumno: ");
			calificaciones = teclado.nextFloat();
	       
	        suma = suma + calificaciones;
	       
	        mayor = calificaciones;
	        menor = calificaciones;
			
	        }
			}
	Object nombreCompleto = new String(nombre + " " + apellido);
	Object cantidadExamenes = new Integer(numeroExamenes);
	Object calificacion = new Float(calificaciones);
	Object[] Alumno = {nombreCompleto, cantidadExamenes, calificacion};

	for(Object aux : Alumno) {
		if (calificaciones > mayor){
			mayor = calificaciones;
		} else if (calificaciones < menor) {
			menor = calificaciones;
		
		
		System.out.println("La mayor nota ha sido un " + mayor + " y a sido de: " + nombre + " " + apellido);
		System.out.println("La menor nota ha sido un " + menor + " y a sido de: " + nombre + " " + apellido);
		}
		}
		
		
			
		
		/*if(calificaciones > 0) {
			float mayor = calificaciones;
			float menor = calificaciones;
			for (int i = 1; i < calificaciones; i++) {
				float calificacionActual = i;
				if (calificacionActual > i) {
					mayor = calificacionActual;
				}
				if(calificacionActual <= i) {
					menor = calificacionActual;
				}	
			System.out.println("la calificacion mas alta fue " + mayor + " y fue de " + nombreCompleto);
			System.out.println("la calificacion mas baja fue " + menor + " y fue de " + nombreCompleto);
			}
		}*/
			

	}

}

/*if(aux instanceof String) {
	String auxString = (String)aux;
	System.out.println(auxString);
}else if(aux instanceof Integer) {
	Integer auxInteger = (Integer)aux;
	System.out.println(auxInteger);
} else {
	Float auxFloat = (Float)aux;
	System.out.println(auxFloat);
	
	

	
	Scanner sc = new Scanner(System.in);
        int n;
        double nota, suma = 0, mayor, menor;;
       
        System.out.println("Nota media, mayor y menor de una clase");
        System.out.println("--------------------------------------");

        do {
            System.out.print("Introduce numero de alumnos: ");
            n = sc.nextInt();  //n contiene el número de alumnos
        } while (n <= 0); //repetir mientras que el valor de n sea <= 0

        System.out.print("Nota del alumno 1: ");
        nota = sc.nextDouble(); // leemos la nota del primer alumno
       
        suma = suma + nota; //la sumamos al acumulador
       
        mayor = nota; //la tomamos como nota mayor y menor
        menor = nota;
       
        for (int i = 2; i <= n; i++) {  // leemos el resto de notas desde el alumno 2 hasta el alumno n         
            System.out.print("Nota del alumno " + i + ": ");
            nota = sc.nextDouble();
            suma = suma + nota; // la sumamos al acumulador
            if (nota > mayor){  // se compara la nota con la mayor y con la menor actual
                mayor = nota;
            } else if (nota < menor) {
                menor = nota;
            }
        }

        // mostrar resultados
        System.out.printf("Nota media: %.2f %n" , suma/n);
        System.out.println("La mayor nota ha sido un " + mayor);
        System.out.println("La menor nota ha sido un " + menor);
	
}*/