package principalPackage;

public class DistribucionGeneral {

	public static void sort(int v[]) {
		int minimo = minimo(v);
		int maximo = maximo(v);
		int apariciones[] = new int[maximo - minimo + 1];
		for (int i = 0; i < v.length; i++) {
			apariciones[v[i] - minimo]++;
		}
		int j = 0;
		for (int i = 0; i < apariciones.length; i++) {
			for (int k = 0; k < apariciones[i]; k++) {
				v[j++] = minimo + i;
			}
		}
	}

	public static void reverseSort(int v[]) {
		int minimo = minimo(v);
		int maximo = maximo(v);
		int apariciones[] = new int[maximo - minimo + 1];
		for (int i = 0; i < v.length; i++) {
			apariciones[maximo - v[i]]++;
		}
		int j = 0;
		for (int i = 0; i < apariciones.length; i++) {
			for (int k = 0; k < apariciones[i]; k++) {
				v[j++] = maximo - i;
			}
		}
	}
	
	private static int minimo(int v[]) {
		int minimo = v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i] < minimo) {
				minimo = v[i];
			}
		}
		return minimo;
	}
	
	private static int maximo(int v[]) {
		int maximo = v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i] > maximo) {
				maximo = v[i];
			}
		}
		return maximo;
	}
	
}
