package PracticaSemanalSemana2;

import java.util.Scanner;

public class Intento2Ejercicio1 {

	public static void main(String[] args) {
		
		 int dd = 0;
         int mm;
         int yyyy;
         int fecha;
         int continuar;

         Scanner teclado = new Scanner(System.in);
         
         
         System.out.println("Ingrese el anio la fecha que necesita");
         yyyy = teclado.nextInt();
         
         
         if(yyyy >= 1900 && yyyy <= 2099) {
             System.out.println("Excelente el anio que a seleccionado es el " + yyyy);
         }else {
             System.out.println("Esa fecha no es valida");
             
         }

         System.out.println("Seleccione el mes de la fecha que necesita");
         mm = teclado.nextInt();
         
     	switch(mm) {
     	
     	
    	
    	case 1 : {
    		
    		System.out.println("elige el dia que necesita");
    		 dd = teclado.nextInt();
    		 if (dd >= 1 && dd <= 30) {
    			 System.out.println("a seleccionado el dia " + dd);

    	        }else {
    	        	if(dd > 30 || dd < 1) {
    	        		
    	        		System.out.println("Este dia no esta disponible en este mes");
    	        		
    	        	
    	        	}
    	        }
    		 break;
    	 
            }
    	
    	case 2 : {
    		
    		System.out.println("elige el dia que necesita");
    		 dd = teclado.nextInt();
    		 if(yyyy % 4 == 0 ) {
    			 if (dd >= 1 && dd <= 29) {
    				 System.out.println("a seleccionado el dia " + dd);
    			 }else {
    				 System.out.println("el dia seleccionado no existe");
    						 
    						
    			        		System.out.println("En este año no esta disponoble el 29 de febrero");
    			 }
    					 }else {
        					 if(yyyy % 4 != 0) {
        						 if(dd >= 1 && dd <= 28) {
        							 System.out.println("a seleccionado el dia " + dd);
        						 }else {
        							 System.out.println("el dia seleccionado no existe");
        							
        							
    				 }
    			 
    		   }

    	   }
    		 break;
    	}
    	
    	case 3 : {
    		
    		System.out.println("elige el dia que necesita");
    		 dd = teclado.nextInt();
    		 if (dd >= 1 && dd <= 30) {
    			 System.out.println("a seleccionado el dia " + dd);

    	        }else {
    	        	if(dd > 30 || dd < 1) {
    	        		
    	        		System.out.println("Este dia no esta disponible en este mes");
    	        		
    	        	
    	        	}
    	        }
    	 
    	break;
    	    }
    		
    	
    	case 4 : {
    		
    		System.out.println("elige el dia que necesita");
    		 dd = teclado.nextInt();
    		 if (dd >= 1 || dd <= 31) {
    			 System.out.println("a seleccionado el dia " + dd);

    	        }else {
    	        	if(dd > 31 && dd < 1) {
    	        		
    	        		System.out.println("Este dia no esta disponible en este mes");
    	        		
    	        	
    	        	}
    	        }
    		 break;

    	   }
    	
    		 case 5 : {
    			 
    				System.out.println("elige el dia que necesita");
    				 dd = teclado.nextInt();
    				 if (dd >= 1 && dd <= 30) {
    					 System.out.println("a seleccionado el dia " + dd);

    			        }else {
    			        	if(dd > 30 || dd < 1) {
    			        		
    			        		System.out.println("Este dia no esta disponible en este mes");
    			        	
    			        	
    			        	}
    			        }
    		     break;       
    		 }
    	

    		 case 6 : {
    			 
    				System.out.println("elige el dia que necesita");
    				 dd = teclado.nextInt();
    				 if (dd >= 1 && dd <= 31) {
    					 System.out.println("a seleccionado el dia " + dd);

    			        }else {
    			        	if(dd > 31 || dd < 1) {
    			        		
    			        		System.out.println("Este dia no esta disponible en este mes");
    			        		
    			        	
    			        	}
    			        }
    				 break;
    		
    		      }
    		 
    		 case 7 : {
    			 
    				System.out.println("elige el dia que necesita");
    				 dd = teclado.nextInt();
    				 if (dd >= 1 && dd <= 30) {
    					 System.out.println("a seleccionado el dia " + dd);

    			        }else {
    			        	if(dd > 30 || dd < 1) {
    			        		
    			        		System.out.println("Este dia no esta disponible en este mes");
    			        		
    			        	
    			        	}
    			        }
    			 
    		           break; 
    		      }
    		 
    		 
    		 case 8 : {
    			 
    				System.out.println("elige el dia que necesita");
    				 dd = teclado.nextInt();
    				 if (dd >= 1 && dd <= 31) {
    					 System.out.println("a seleccionado el dia " + dd);

    			        }else {
    			        	if(dd > 31 || dd < 1) {
    			        		
    			        		System.out.println("Este dia no esta disponible en este mes");
    			        	
    			        	
    			        	}
    			        }
    				 break;
    	
    		       }
    		 
    		 
    		 case 9 : {
    			 
    				System.out.println("elige el dia que necesita");
    				 dd = teclado.nextInt();
    				 if (dd >= 1 && dd <= 30) {
    					 System.out.println("a seleccionado el dia " + dd);

    			        }else {
    			        	if(dd > 30 || dd < 1) {
    			        		
    			        		System.out.println("Este dia no esta disponible en este mes");
    			        	
    			        	
    			        	}
    			        }
    			 break;
    		       }
    		 
    		 
    		 case 10 : {
    			 
    				System.out.println("elige el dia que necesita");
    				 dd = teclado.nextInt();
    				 if (dd >= 1 || dd <= 31) {
    					 System.out.println("a seleccionado el dia " + dd);

    			        }else {
    			        	if(dd > 31 && dd < 1) {
    			        		
    			        		System.out.println("Este dia no esta disponible en este mes");
    			        		
    			        	
    			        	}
    			        }
    				 break;
    		        }     
    		 
    		 
    		 
    		 case 11 : {
    			 
    				System.out.println("elige el dia que necesita");
    				 dd = teclado.nextInt();
    				 if (dd >= 1 && dd <= 30) {
    					 System.out.println("a seleccionado el dia " + dd);

    			        }else {
    			        	if(dd > 30 || dd < 1) {
    			        		
    			        		System.out.println("Este dia no esta disponible en este mes");
    			        	
    			        	
    			        	}
    			        }
    		            break;
    		        }

    		 
    		 case 12 : {
    			 
    				System.out.println("elige el dia que necesita");
    				 dd = teclado.nextInt();
    				 if (dd >= 1 && dd <= 31) {
    					 System.out.println("a seleccionado el dia " + dd);

    			        }else {
    			        	if(dd > 31 || dd < 1) {
    			        		
    			        		System.out.println("Este dia no esta disponible en este mes");
    			        	
    			        	
    			        	}
    			        }
    				 break;
    		        }
    		 
    		 }
         if(mm >= 1 && mm <= 12) {
     	
     	System.out.println("Su fecha es " + dd + " del " + mm + " del " + yyyy);
     	
         }else {
        	 System.out.println("Ese mes no es valido");
         }

         
         
 		
 		teclado.close();
 		
 		System.out.println("hasta luego");
 		
 		}
        
        }
        
             

	