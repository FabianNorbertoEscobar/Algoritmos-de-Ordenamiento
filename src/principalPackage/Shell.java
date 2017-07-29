package principalPackage;

public class Shell {

	public static void sort(int v[]) {
		boolean cambio;
		for (int salto = v.length / 2; salto > 0; salto /= 2) {
			do {
				cambio = false;
				for (int i = salto; i < v.length; i++) {
					if (v[i - salto] > v[i]) {
						intercambio(v, i - salto, i);
						cambio = true;
					}
				}
			} while (cambio);
		}
	}

	public static void reverseSort(int v[]) {
		boolean cambio;
		for (int salto = v.length / 2; salto > 0; salto /= 2) {
			do {
				cambio = false;
				for (int i = salto; i < v.length; i++) {
					if (v[i - salto] < v[i]) {
						intercambio(v, i - salto, i);
						cambio = true;
					}
				}
			} while (cambio);
		}
	}

	private static void intercambio(int v[], int i, int j) {
		int aux = v[j];
		v[j] = v[i];
		v[i] = aux;
	}
}
