package principalPackage;

public class Seleccion {

	public static void sort(int v[]) {
		int posMenor;
		for (int j = 1; j < v.length; j++) {
			posMenor = j - 1;
			for (int i = j; i < v.length; i++) {
				if (v[i] < v[posMenor]) {
					posMenor = i;
				}
			}
			intercambio(v, j - 1, posMenor);
		}
	}

	public static void reverseSort(int v[]) {
		int posMayor;
		for (int j = 1; j < v.length; j++) {
			posMayor = j - 1;
			for (int i = j; i < v.length; i++) {
				if (v[i] > v[posMayor]) {
					posMayor = i;
				}
			}
			intercambio(v, j - 1, posMayor);
		}
	}

	private static void intercambio(int v[], int i, int j) {
		int aux = v[j];
		v[j] = v[i];
		v[i] = aux;
	}

}
