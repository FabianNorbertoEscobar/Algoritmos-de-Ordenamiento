package principalPackage;

public class PancakeSort {

	public static void sort(int v[]) {
		int maximo, indice;
		for (int i = 0; i < v.length; i++) {
			maximo = v[0];
			indice = 0;
			for (int j = 0; j < v.length - i; j++) {
				if (v[j] > maximo) {
					maximo = v[j];
					indice = j;
				}
			}
			flip(v, indice, v.length - 1 - i);
		}
	}

	public static void reverseSort(int v[]) {
		int minimo, indice;
		for (int i = 0; i < v.length; i++) {
			minimo = v[0];
			indice = 0;
			for (int j = 0; j < v.length - i; j++) {
				if (v[j] < minimo) {
					minimo = v[j];
					indice = j;
				}
			}
			flip(v, indice, v.length - 1 - i);
		}
	}
	
	private static void flip(int v[], int left, int right) {
		while (left <= right) {
			intercambio(v, left++, right--);
		}
	}

	private static void intercambio(int v[], int i, int j) {
		int aux = v[j];
		v[j] = v[i];
		v[i] = aux;
	}
	
}
