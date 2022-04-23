package practicaSemanalSemana4;

public class Helicoptero extends Volador implements Aterrizable{
	
	public Helicoptero(String nombre) {
		super(nombre);
	}

	
	public Estado aterrizar() {
		System.out.println("Helicoptero:" + this.getNombre() + " bajando....");
	
	Estado estado;
	if(Volador.cont % 2 == 0) {
		estado = new Estado(false, "");
	}else {
		estado = new Estado(true, "Valor impar : error " + Volador.cont);
	}
		return estado;
	}
}
