package practicaSemanalSemana5;

public class Main {

	public static void main(String[] args) {
		
		Integer[] array = {1,2,3,4,5,6,7};
		
		CollectionCustom<Integer> arrayCustom = new CollectionCustom<Integer>(array);
		
		System.out.println("el tamanio del array es: " + arrayCustom.size());
		arrayCustom.addFirst(5);
		arrayCustom.addLast(22);
		arrayCustom.add(60);
		arrayCustom.remove(0);
		arrayCustom.removeAll();
		System.out.println("el array esta vacio?: " + arrayCustom.empty());

	}

}