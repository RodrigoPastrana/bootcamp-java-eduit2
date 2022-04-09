package practicasemanalsemana3;

import clase7.Articulo;

public class Alumno {
	
	
	String nombre;
	String apellido;
	int numeroExamen;
	float notaAlumnoExamen;

	public Alumno(String nombre, String apellido, int numeroExamen, float notaAlumnoExamen) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroExamen = numeroExamen;
		this.notaAlumnoExamen = notaAlumnoExamen;
			
	}
	
	void mejoresNotas(){
		Alumno[] mejoresNotas = new Alumno[0];
		mejoresNotas[0] = new Alumno(String nombre, String apellido, int numeroExamen, float notaAlumnoExamen);
	}
	
	
	
	
	
	
}
