package principalPackage;

public class Burbujeo {

	public static void sort(int v[]) {
		int j = 0;
		boolean cambio;
		do {
			cambio = false;
			j++;
			for (int i = 0; i < v.length - j; i++) {
				if (v[i] > v[i + 1]) {
					intercambio(v, i, i + 1);
					cambio = true;
				}
			}
		} while (cambio && j < v.length);
	}

	public static void reverseSort(int v[]) {
		int j = 0;
		boolean cambio;
		do {
			cambio = false;
			j++;
			for (int i = 0; i < v.length - j; i++) {
				if (v[i] < v[i + 1]) {
					intercambio(v, i, i + 1);
					cambio = true;
				}
			}
		} while (cambio && j < v.length);
	}

	private static void intercambio(int v[], int i, int j) {
		int aux = v[j];
		v[j] = v[i];
		v[i] = aux;
	}

}
