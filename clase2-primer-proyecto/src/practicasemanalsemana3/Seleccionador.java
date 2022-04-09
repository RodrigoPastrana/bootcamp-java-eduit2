package practicasemanalsemana3;

import clase7.Articulo;

public class Seleccionador {
	
	String nombreAlumno;
	Alumno[] alumnos;
	Integer cantidad;
	
	Seleccionador(){
		nombreAlumno = "";
		alumnos = new Alumno[0];
		cantidad = 0;
	}
	
	Seleccionador(String nombreAlumno) {
		
		this.nombreAlumno = nombreAlumno;
	}
	
	void detalle() {
		//¿como recorro los resultados?
		for(int i=0;i<this.cantidad;i++){
			//me quedo con el articulo en la posicion i
			
			Articulo unArticulo = this.articulos[i];
			
			System.out.println(unArticulo.nombre);
			System.out.println(unArticulo.autor);
			//solo mostrar la img si tiene una, ¿como hago?
			if(unArticulo.tieneImagen()) {//f5
				System.out.println(unArticulo.urlImagen);
			}else {
				System.out.println("No tiene, muestro marca de agua");
			}
		}
	}
	
	
	
	Seleccionador(int numeroAlumnos){
		this.numeroAlumnos = numeroAlumnos;
	}

}
