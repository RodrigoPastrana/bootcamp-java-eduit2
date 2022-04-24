package practicaSemanalSemana5;

import java.util.Arrays;

public class CollectionCustom <T>{

	private T[] arrayOfTypes;
	
	public CollectionCustom(T[] array) {
		arrayOfTypes = array;
	}
	
	public int size() {
		
		int size = arrayOfTypes.length;
		return size;
	}
	
	public void addFirst(T parametro) {
		
		int contador = -1;
		T newArray[] = Arrays.copyOf(arrayOfTypes, (arrayOfTypes.length + 1));
		
		for (T i : newArray) {
			if(contador == -1) {
				newArray[contador + 1] = parametro;
				
			}else {
				newArray[contador + 1] = arrayOfTypes[contador];
			}
			contador++;
			
		}
		arrayOfTypes = newArray;
		System.out.println("nuevo tamanio " + size());
		Printer();
		System.out.println("fin 1");
	}
	
	public void addLast(T parametro) {
		T newArray[] = Arrays.copyOf(arrayOfTypes, (arrayOfTypes.length + 1));
		newArray[newArray.length - 1] = parametro;
		arrayOfTypes = newArray;
		Printer();
		System.out.println("fin 2");
	}
	
	public boolean add(T parametro) {
		
		boolean agregar = false;
		addLast(parametro);
		if (arrayOfTypes[arrayOfTypes.length - 1] == parametro) {
			agregar = true;
		}
		System.out.println("fin 3");
		return agregar;
	}
	
	public T remove(int posicion) {
		
		int cont = 0;
		int cont2 = 0;
		T devuelto = arrayOfTypes[posicion];
		
		T newArray[] = Arrays.copyOf(arrayOfTypes, arrayOfTypes.length - 1);
		
		if(cont <= newArray.length){
			System.out.println("valor removido: " + newArray.length);
		}
		
		
		
		arrayOfTypes = newArray;
		Printer();
		System.out.println("fin 4");
		return devuelto;
	}
	
	public void removeAll() {
		
		T newArray[] = Arrays.copyOf(arrayOfTypes, 0);
		arrayOfTypes = newArray;
	}
	
	public boolean empty() {
		boolean booleano = false;
		if(arrayOfTypes.length > 0) {
			booleano = false;
		}else {
			booleano = true;
		}
		return booleano;
	}
	
	private void Printer() {
		
		for(T i : arrayOfTypes) {
			System.out.println(i);
		}
		
	}
	
}
