package practicaSemanalSemana4;

public class Superman extends Volador implements Aterrizable {

	public Superman() {
		super("CLARK KEN");
	}

	
	public Estado aterrizar() {
		System.out.println("Superman; puede aterrizar");
		Estado estado;
		if(Volador.cont % 2 == 0) {
			estado = new Estado(false, "");
		}else {
			estado = new Estado(true, "Valor impar : error " + Volador.cont);
		}
		return estado;
		}
	}
	
	

