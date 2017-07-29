package principalPackage;

public class Main {

	public static void main(String[] args) {

		System.out.println("Algoritmos de Ordenamiento");
		int vector[] = { 6, 5, 3, 1, 8, 7, 2, 4 };
		
		System.out.println("Vector desordenado");
		mostrar(vector);
		
		pruebaBurbujeo(vector);
		pruebaSeleccion(vector);
		pruebaInsercion(vector);
		pruebaShell(vector);
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
	
	private static void pruebaSeleccion(int vector[]) {
		System.out.println("SELECCION");
		
		int v1[] = vector.clone();
		Seleccion.sort(v1);
		System.out.println("Sort");
		mostrar(v1);
		
		int v2[] = vector.clone();
		Seleccion.reverseSort(v2);
		System.out.println("Reverse Sort");
		mostrar(v2);
	}
	
	private static void pruebaInsercion(int vector[]) {
		System.out.println("INSERCION");
		
		int v1[] = vector.clone();
		Insercion.sort(v1);
		System.out.println("Sort");
		mostrar(v1);
		
		int v2[] = vector.clone();
		Insercion.reverseSort(v2);
		System.out.println("Reverse Sort");
		mostrar(v2);
	}
	
	private static void pruebaShell(int vector[]) {
		System.out.println("SHELL");
		
		int v1[] = vector.clone();
		Shell.sort(v1);
		System.out.println("Sort");
		mostrar(v1);
		
		int v2[] = vector.clone();
		Shell.reverseSort(v2);
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
