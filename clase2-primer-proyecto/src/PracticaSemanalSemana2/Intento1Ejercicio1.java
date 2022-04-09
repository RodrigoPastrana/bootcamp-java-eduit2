package PracticaSemanalSemana2;

import java.util.Scanner;

public class Intento1Ejercicio1 {

	public static void main(String[] args) {
		
		int yyyy;
		int mm;
		int dd = 0;
		int fecha;
	
		  Scanner teclado = new Scanner(System.in);
		  System.out.println("Ingrese el año la fecha que necesita");
	        yyyy = teclado.nextInt();

	        if(yyyy >= 1900 && yyyy <= 2099) {
	            System.out.println("Excelente el año que a seleccionado es el " + yyyy);
	        }else {
	            System.out.println("Esa fecha no es valida");
	            System.exit(1);
	        }
	        
	        System.out.println("Seleccione el mes de la fecha que necesita");
	        mm = teclado.nextInt();
	        	if(mm >= 1 && mm <= 12){
	        		System.out.println("el mes seleccionado es " + mm);
	        	}else {
	        		System.out.println("Esa fecha no es valida");
		            System.exit(1);
	        	}
	        	
	        System.out.println("Seleccione el dia de la fecha que necesita");
		    dd = teclado.nextInt();	
	        
	        switch(dd) {
	       
	        case 1:
	        	
	        		System.out.println("elige el dia que necesita");
	        		dd = teclado.nextInt();
	        		if (dd >= 1 && dd <= 30) {
   			 		System.out.println("a seleccionado el dia " + dd);

	        		}else {
	        			if(dd > 30 || dd < 1) {
   	        		
	        				System.out.println("Este dia no esta disponible en este mes");
	        				System.exit(0);
   	        	
   	        	}
   	        }
	        		break;
	        
	        case 2:
	        	System.out.println("elige el dia que necesita");
	    		 dd = teclado.nextInt();
	    		 if (mm % 2 == 0 && mm != 2){
	    			 if(dd >= 1 && dd <= 31) {
	    				 System.out.println("a seleccionado el dia " + dd);
	    			 }else {
	    				 System.out.println("el dia seleccionado no existe");
	    			 }
	    		 }
	    			 break;
	        case 3:
	        	System.out.println("elige el dia que necesita");
	    		 dd = teclado.nextInt();
	    		 if (mm % 3 == 0) {
	    			 if(dd >= 1 && dd <= 30) {
	    				 System.out.println("a seleccionado el dia " + dd);
	    			 }else {
	    				 System.out.println("el dia seleccionado no existe");
	    			 }
	    		 }
	    		 	break;
	    		 	
	        case 4:
	        	System.out.println("elige el dia que necesita");
	    		 dd = teclado.nextInt();
	    		 if(yyyy % 4 == 0 && mm == 2) {
	    			 if(dd >= 1 && dd <= 29) {
	    				 System.out.println("a seleccionado el dia " + dd);
	    			 }else {
	    				 System.out.println("el dia seleccionado no existe");
	    			 }
	    		 }
	    		 break;
	    		 
	        case 5:
	        	System.out.println("elige el dia que necesita");
	    		 dd = teclado.nextInt();
	    		 if(mm == 2 && yyyy % 4 != 0) {
	    			 if(dd >= 1 && dd <= 28) {
	    				 System.out.println("a seleccionado el dia " + dd);
	    			 }else {
	    				 System.out.println("el dia seleccionado no existe");
	    			 }
	    		 }
	    		 break;
	        }
	        
	        
	        System.out.println("Su fecha es " + dd + " del " + mm + " del " + yyyy);

	         
	         teclado.close(); 	

	}
}


