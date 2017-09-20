package algoritmos;

public class DistribucionParticular {

	public static void sort(int v[]) {
		int tmp[] = new int[v.length];
		int minimo = minimo(v);
		for (int i = 0; i < tmp.length; i++) {
			tmp[v[i] - minimo] = v[i];
		}
		for (int i = 0; i < tmp.length; i++) {
			v[i] = tmp[i];
		}
	}

	public static void reverseSort(int v[]) {
		int tmp[] = new int[v.length];
		int maximo = maximo(v);
		for (int i = 0; i < tmp.length; i++) {
			tmp[maximo - v[i]] = v[i];
		}
		for (int i = 0; i < tmp.length; i++) {
			v[i] = tmp[i];
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
