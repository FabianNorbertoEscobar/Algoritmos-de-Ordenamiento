package principalPackage;

public class CocktailSort {

	public static void sort(int v[]) {
		boolean cambio;
		do {
			cambio = false;
			for (int i = 0; i < v.length - 2; i++) {
				if (v[i] > v[i + 1]) {
					intercambio(v, i, i + 1);
					cambio = true;
				}
			}
			if (!cambio) {
				break;
			}
			for (int i = v.length - 2; i >= 0 ; i--) {
				if (v[i] > v[i + 1]) {
					intercambio(v, i, i + 1);
					cambio = true;
				}
			}
		} while (cambio);
	}

	public static void reverseSort(int v[]) {
		boolean cambio;
		do {
			cambio = false;
			for (int i = 0; i < v.length - 2; i++) {
				if (v[i] < v[i + 1]) {
					intercambio(v, i, i + 1);
					cambio = true;
				}
			}
			if (!cambio) {
				break;
			}
			for (int i = v.length - 2; i >= 0 ; i--) {
				if (v[i] < v[i + 1]) {
					intercambio(v, i, i + 1);
					cambio = true;
				}
			}
		} while (cambio);
	}

	private static void intercambio(int v[], int i, int j) {
		int aux = v[j];
		v[j] = v[i];
		v[i] = aux;
	}

}
