package principalPackage;

public class Quicksort {

	public static void sort(int v[]) {
		sort(v, 0, v.length - 1);
	}
	
	private static void sort(int v[], int izq, int der) {
		int pivot = v[izq];
		int i = izq;
		int j = der;
		while (i < j) {
			while (v[i] <= pivot && i < j) {
				i++;
			}
			while (v[j] > pivot) {
				j--;
			}
			if (i < j) {
				intercambio(v, i , j);
			}
		}
		v[izq] = v[j];
		v[j] = pivot;
		if (izq < j - 1) {
			sort(v, izq, j - 1);
		}
		if (j + 1 < der) {
			sort(v, j + 1, der);
		}
	}
	
	public static void reverseSort(int v[]) {
		reverseSort(v, 0, v.length - 1);
	}
	
	private static void reverseSort(int v[], int izq, int der) {
		int pivot = v[izq];
		int i = izq;
		int j = der;
		while (i < j) {
			while (v[i] >= pivot && i < j) {
				i++;
			}
			while (v[j] < pivot) {
				j--;
			}
			if (i < j) {
				intercambio(v, i , j);
			}
		}
		v[izq] = v[j];
		v[j] = pivot;
		if (izq < j - 1) {
			reverseSort(v, izq, j - 1);
		}
		if (j + 1 < der) {
			reverseSort(v, j + 1, der);
		}
	}

	private static void intercambio(int v[], int i, int j) {
		int aux = v[j];
		v[j] = v[i];
		v[i] = aux;
	}
}
