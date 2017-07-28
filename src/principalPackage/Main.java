package principalPackage;

public class Main {

	public static void main(String[] args) {

		System.out.println("Algoritmos de Ordenamiento");
		int vector[] = { 6, 5, 3, 1, 8, 7, 2, 4 };
		
		System.out.println("Vector desordenado");
		mostrar(vector);
		
		pruebaBurbujeo(vector);
		
	}
	
	private static void pruebaBurbujeo(int vector[]) {
		System.out.println("BURBUJEO");
		
		int v1[] = vector.clone();
		Burbujeo.sort(v1);
		System.out.println("Sort");
		mostrar(v1);
		
		int v2[] = vector.clone();
		Burbujeo.reverseSort(v2);
		System.out.println("Reverse Sort");
		mostrar(v2);
	}
	
	private static void mostrar(int v[]) {
		for (int i : v) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
