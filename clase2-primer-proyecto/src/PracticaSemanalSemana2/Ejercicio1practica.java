 
	        package PracticaSemanalSemana2;

	        import java.util.Scanner;

	        public class Ejercicio1practica {

	        	public static void main(String[] args) {
	        		
	        		 int dd;
	        	        int mm;
	        	        int yyyy;
	        	        int fecha;

	        	        Scanner teclado = new Scanner(System.in);
	        	        System.out.println("Ingrese el dia la fecha que necesita");
	        	        yyyy = teclado.nextInt();

	        	        if(yyyy >= 1900 && yyyy <= 2099) {
	        	            System.out.println("Excelente el año que a seleccionado es el " + yyyy);
	        	        }else {
	        	            System.out.println("Esa fecha no es valida");
	        	            System.exit(1);
	        	        }

	        	        System.out.println("Seleccione el mes de la fecha que necesita");
	        	        mm = teclado.nextInt();

	        	        if(mm >= 1 && mm <= 12) {
	        	        	
	        	            System.out.println("Excelente el mes que a seleccionado es el " + mm);
	        	        }else {

	        	            System.out.println("Esa fecha no es valida");
	        	            System.exit(1);
	        	        }

	        	        System.out.println("Seleccione el dia de la fecha que necesita");
	        	        dd = teclado.nextInt();
	        	        
	        	        if(mm % 2 == 0 ) {
	        	        	if(dd >= 1 && dd <= 31) {
	        	        		
	        	        		System.out.println("Excelente el dia que a seleccionado es el " + dd);
	        	        }else {
	        	        	if(dd >= 1 && dd <= 30) {
	        	        		
	        	        		System.out.println("Excelente el dia que a seleccionado es el " + dd);
	        	        	}
	
	        }
	}


	        System.out.println("La fecha que selecciono fue " );		

	}

}
