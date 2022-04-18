package ejercicio1;

import java.util.Scanner;

public class PracticaAdicionalSemana2 {
	public static void main(String[] args) {
		
		
		 int dd = 0;
        int mm;
        int yyyy;
        int continuar;

        Scanner teclado = new Scanner(System.in);
        
        do {
       	
       	 yyyy = validarAnios(1900,2099,teclado,"ingrese el anio que busca del 1900 al 2099");
       	 	
       	 mm = validarMes(1,12,teclado,"ingrese el mes que busca");
        
       	 
    	switch(mm) {
    	
   	case 1 : {
   		
   		dd = validarDias1(1,30,teclado,"ingrese el dia que busca");
   		
   		 break;
   	 
           }
   	
   	case 2 : {
   		
   		dd = validarDias2(1,29,teclado,"ingrese el dia que busca");
   		 if(yyyy % 4 == 0 ) {
   			 if (dd >= 1 && dd <= 29) {
   				 System.out.println("a seleccionado el dia " + dd);
   			 }else {
   				 System.out.println("el dia seleccionado no existe");
   				 System.exit(0); 
   				 }
   					 }else {
       					 if(yyyy % 4 != 0) {
       						 if(dd >= 1 && dd <= 28) {
       							 System.out.println("a seleccionado el dia " + dd);
       						 }else {
       							 System.out.println("el dia seleccionado no existe");
       							 System.exit(0); 		
   				 } 
   		   }
   	   }
   		 break;
   	}
   	
   	case 3 : {
   		dd = validarDias1(1,30,teclado,"ingrese el dia que busca");
   		
  		 break;
   	    }
   	
   	case 4 : {
   		dd = validarDias3(1,31,teclado,"ingrese el dia que busca");
   		
   		 break;
   	   }
   	
   		 case 5 : {
   	    		dd = validarDias1(1,30,teclado,"ingrese el dia que busca");
   	    		
   	      		 break;
   	       	    }

   		 case 6 : {
   	    		dd = validarDias3(1,31,teclado,"ingrese el dia que busca");
   	    		
   	    		 break;
   	    	   }
   		 
   		 case 7 : {
   	    		dd = validarDias1(1,30,teclado,"ingrese el dia que busca");
   	    		
   	      		 break;
   	       	    }
   		 
   		 case 8 : {
   	    		dd = validarDias3(1,31,teclado,"ingrese el dia que busca");
   	    		
   	    		 break;
   	    	   }
   		 
   		 case 9 : {
   	    		dd = validarDias1(1,30,teclado,"ingrese el dia que busca");
   	    		
   	      		 break;
   	       	    }
   		 
   		 case 10 : {
   	    		dd = validarDias3(1,31,teclado,"ingrese el dia que busca");
   	    		
   	    		 break;
   	    	   }
   		 
   		 case 11 : {
   	    		dd = validarDias1(1,30,teclado,"ingrese el dia que busca");
   	    		
   	      		 break;
   	       	    }
   		 
   		 case 12 : {
   	    		dd = validarDias3(1,31,teclado,"ingrese el dia que busca");
   	    		
   	    		 break;
   	    	   }
   		 
   		 }
   
         	
         	System.out.println("Su fecha es " + dd + " del " + mm + " del " + yyyy);
         	
    	 
        
        do {
			System.out.println("continuar (1=si,0=no)");
			continuar = teclado.nextInt();
		}while(continuar < 0 || continuar > 1);
			
       	 
		}while(continuar == 1);
        
        
		
		teclado.close();
		
		System.out.println("hasta luego");
		
		
       
        
        }
	
	private static int validarAnios(int i, int j, Scanner teclado, String msj) {
		int yyyy;
		do {
			mostrarMenu(msj); 
			yyyy = teclado.nextInt();
		}while(yyyy < i || yyyy > j);
		return yyyy;
	}
	
	static void mostrarMenu(String msj) {
		System.out.println(msj);
	}
	
	private static int validarMes(int q,int w, Scanner teclado, String msj1) {
		int mm;
		do {
			mostrarMenu1(msj1);
			mm = teclado.nextInt();
		}while(mm < q || mm > w);
		return mm;
	}
	
	static void mostrarMenu1(String msj1) {
		System.out.println(msj1);
	}
	
	private static int validarDias1(int e, int r, Scanner teclado, String msj2) {
		int dd;
		do {
			mostrarMenu2(msj2); 
			dd = teclado.nextInt();
		}while(dd < e || dd > r);
		return dd;
	}
	
	static void mostrarMenu2(String msj2) {
		System.out.println(msj2);
	}
	
	private static int validarDias2(int t, int y, Scanner teclado, String msj3) {
		int dd;
		do {
			mostrarMenu3(msj3); 
			dd = teclado.nextInt();
		}while(dd < t || dd > y);
		return dd;
	}
	
	static void mostrarMenu3(String msj3) {
		System.out.println(msj3);
	}
	
	private static int validarDias3(int u, int o, Scanner teclado, String msj4) {
		int dd;
		do {
			mostrarMenu4(msj4); 
			dd = teclado.nextInt();
		}while(dd < u || dd > o);
		return dd;
	}
	
	static void mostrarMenu4(String msj4) {
		System.out.println(msj4);
	}
	
}
