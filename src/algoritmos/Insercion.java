package algoritmos;

public class Insercion {

	public static void sort(int v[]) {
		int j;
		for (int i = 1; i < v.length; i++) {
			j = i;
			while (j > 0 && v[j] < v[j - 1]) {
				intercambio(v, j, j - 1);
				j--;
			}
		}
	}

	public static void reverseSort(int v[]) {
		int j;
		for (int i = 1; i < v.length; i++) {
			j = i;
			while (j > 0 && v[j] > v[j - 1]) {
				intercambio(v, j, j - 1);
				j--;
			}
		}
	}

	private static void intercambio(int v[], int i, int j) {
		int aux = v[j];
		v[j] = v[i];
		v[i] = aux;
	}
	
}
