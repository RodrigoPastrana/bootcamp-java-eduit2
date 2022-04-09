package clase4;

import java.util.Scanner;

public class SwitchMainMia {

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
			do {
				mostrarMenu();
				opcion = teclado.nextInt();
			}while(opcion < 0 || opcion > 4);
		
			if (opcion ==0) {
				System.out.println("hasta luego");
				System.exit(0); 
			}
			System.out.println("Ingrese a");
			a = teclado.nextDouble();
		
			System.out.println("Ingrese b");
			b = teclado.nextDouble();
		
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
		}
			
		do {
			System.out.println("continuar (1=si,0=no)");
			continuar = teclado.nextInt();
		}while(continuar < 0 || continuar > 1);
			
		
		}while(continuar == 1);
		
		teclado.close();
		
		System.out.println("denada capo");
		
		}
	

	static void mostrarMenu() {
		System.out.println("Ingrese operacion: ");
		System.out.println("0=salir, 1=suma, 2=resta; 3=multi, 4=div");
	//estos son los codigos que abrevie al principio
	}
	static void mostrarResultado(double res, String operacion) {
		System.out.println(" La operacion " + operacion + " = " + res);//f6
	}//f7
}
