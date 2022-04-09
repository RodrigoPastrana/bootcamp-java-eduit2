package clase4;

import java.util.Scanner;

public class SwitchMain {

	public static void main(String[] args) {
		/**
		 * Realizar una mini calculadora
		 * operaciones:
		 * +,-,/,*
		 * 
		 * El usuario ingrear la operacion(+,/,*,- 0 PARA SALIR)
		 * 0,1,2,3,4 (0=salir; 1=resta; 2=mult; 3=divi; 4 =suma)
		 */
		//switch
		//ascci ?
		//if
		//do;while
		
		int opcion;
		double res;
		double a;
		double b;
		int continuar;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			/*do {
				mostrarMenu(); //Alt+Shift+M (y te abrevia los codigos que seleccionas con el titulo que le metes)
				opcion = teclado.nextInt();
			}while(opcion < 0 || opcion > 4); //salir si < 0 || >4
		
		opcion = teclado.nextInt();
			if (opcion ==0) {
				System.out.println("hasta luego");
				System.exit(0); 
			}*/
			
			opcion = validarOpciones(0,4,teclado, "ingrese operacion: \n 1=suma, 2=resta, 3=multi, 4=div");
			
			a = leerData("ingrese a", teclado);//click en el error que aparece a la izquierda y doble click en la primer opcion para que te cree el codigo solo 
		
			b = leerData("ingrese b", teclado);
		
			//double aux = leerData("ingrese c", teclado);
		
			switch(opcion) { //cambie todos los "if" y los "else" que tenia por un switch y los cases
				case 1:
					res = a + b;
			
					mostrarResultado(res, "+");
					break;
				case 2:
			//ctrl + D (borro toda la linea seleccionada)
			//f6 (para pasar al siguien en el debug)
			
					res = a - b;
			
					mostrarResultado(res, "-");//f5 (para meterte adentro de esta funcion)
			//f7(para ir a la funcion anterior, cuando entras a una con F5)
					break;
				case 3:
			
					res = a * b;
			
					mostrarResultado(res, "*");
					break;
				case 4:
			
					if(b != 0) {
						res = a / b;
						mostrarResultado(res, "/");
					}else {
						System.out.println("No se puede divir por 0");
					}
					break;
				default :
					System.out.println("opcion invalida");
			}
		
			continuar = validarOpciones(0, 1, teclado, "continuar (1=si,0=no)");
		
			}while(continuar ==1);	
			
			teclado.close();
		
			System.out.println("saliendo...");
		
		}

	private static int validarOpciones(int i, int j, Scanner teclado, String msj) {
		int opcion;
		do {
			mostrarMenu(msj); 
			opcion = teclado.nextInt();
		}while(opcion < i || opcion > j);
		return opcion;
	}

	static double leerData(String msj, Scanner teclado) {
		System.out.println(msj);
		return teclado.nextDouble();
	//este es el codigo que te crea solo de a y b
	}

	static void mostrarMenu(String msj) {
		System.out.println(msj);
	//estos son los codigos que abrevie al principio
	}

	static void mostrarResultado(double res, String operacion) {
		System.out.println(" La operacion " + operacion + " = " + res);//f6
	}//f7
}
