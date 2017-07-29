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
		pruebaQuicksort(vector);
		pruebaFusion(vector);
		pruebaCocktailSort(vector);
		pruebaBogoSort(vector);
		pruebaPancakeSort(vector);

		int v1[] = { 17, 19, 10, 15, 13, 12, 16, 14, 11, 18 };
		System.out.println("Vector desordenado con claves consecutivas no repetidas");
		mostrar(v1);
		pruebaDistribucionParticular(v1);

		int v2[] = { 14, 13, 15, 14, 14, 13, 15, 15, 13, 13 };
		System.out.println("Vector desordenado con claves consecutivas repetidas");
		mostrar(v2);
		pruebaDistribucionGeneral(v2);
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

	private static void pruebaQuicksort(int vector[]) {
		System.out.println("QUICKSORT");

		int v1[] = vector.clone();
		Quicksort.sort(v1);
		System.out.println("Sort");
		mostrar(v1);

		int v2[] = vector.clone();
		Quicksort.reverseSort(v2);
		System.out.println("Reverse Sort");
		mostrar(v2);
	}

	private static void pruebaFusion(int vector[]) {
		System.out.println("FUSION");

		int v1[] = vector.clone();
		Fusion.sort(v1);
		System.out.println("Sort");
		mostrar(v1);

		int v2[] = vector.clone();
		Fusion.reverseSort(v2);
		System.out.println("Reverse Sort");
		mostrar(v2);
	}
	
	private static void pruebaCocktailSort(int vector[]) {
		System.out.println("COCKTAILSORT");

		int v1[] = vector.clone();
		CocktailSort.sort(v1);
		System.out.println("Sort");
		mostrar(v1);

		int v2[] = vector.clone();
		CocktailSort.reverseSort(v2);
		System.out.println("Reverse Sort");
		mostrar(v2);
	}
	
	private static void pruebaBogoSort(int vector[]) {
		System.out.println("BOGOSORT");

		int v1[] = vector.clone();
		BogoSort.sort(v1);
		System.out.println("Sort");
		mostrar(v1);

		int v2[] = vector.clone();
		BogoSort.reverseSort(v2);
		System.out.println("Reverse Sort");
		mostrar(v2);
	}
	
	private static void pruebaPancakeSort(int vector[]) {
		System.out.println("PANCAKESORT");

		int v1[] = vector.clone();
		PancakeSort.sort(v1);
		System.out.println("Sort");
		mostrar(v1);

		int v2[] = vector.clone();
		PancakeSort.reverseSort(v2);
		System.out.println("Reverse Sort");
		mostrar(v2);
	}

	private static void pruebaDistribucionParticular(int vector[]) {
		System.out.println("DISTRIBUCIÓN PARTICULAR");

		int v1[] = vector.clone();
		DistribucionParticular.sort(v1);
		System.out.println("Sort");
		mostrar(v1);

		int v2[] = vector.clone();
		DistribucionParticular.reverseSort(v2);
		System.out.println("Reverse Sort");
		mostrar(v2);
	}
	
	private static void pruebaDistribucionGeneral(int vector[]) {
		System.out.println("DISTRIBUCIÓN GENERAL");

		int v1[] = vector.clone();
		DistribucionGeneral.sort(v1);
		System.out.println("Sort");
		mostrar(v1);

		int v2[] = vector.clone();
		DistribucionGeneral.reverseSort(v2);
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
