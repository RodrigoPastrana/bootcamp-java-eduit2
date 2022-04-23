package practicaSemanalSemana4;

public class TorreDeControlMain {

	public static void main(String[] args) {
		
		Volador[] voladores = CreadorDeVoladores.crearVoladores();

				
				for(Volador v : voladores) {
					
					
					if(v instanceof Aterrizable) {
						
						Aterrizable a = (Aterrizable)v;
						
						Estado estado = a.aterrizar();
						
						if(estado.isError()) {
							System.out.println(v.getNombre() + ":" + estado.getMsj() + "estamos enviando ayuda");
						}
						
					}else {
						System.out.println("no puede aterrizar aqui");
					}
				}
						
	}

		}
