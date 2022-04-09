package practicaSemanalSemana4;

public class Avion extends Volador implements Aterrizable{
	
	public Avion(String nombre) {
		super(nombre);
	}

	
	public Estado aterrizar() {
		System.out.println("Avion:" + this.getNombre() + " puede aterrizar");
	
	Estado estado;
	if(Volador.cont % 2 == 0) {
		estado = new Estado(false, "");
	}else {
		estado = new Estado(true, "Valor impar : error " + Volador.cont);
	}
		return estado;
	}

}
