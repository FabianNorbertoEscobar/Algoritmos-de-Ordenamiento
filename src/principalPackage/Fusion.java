package principalPackage;

public class Fusion {

	public static void sort(int v[]) {
		sort(v, 0, v.length - 1);
	}

	private static void sort(int v[], int izq, int der) {
		if (izq < der) {
			int media = (izq + der) / 2;
			sort(v, izq, media);
			sort(v, media + 1, der);
			merge(v, izq, media, der);
		}
	}

	private static void merge(int[] v, int izq, int media, int der) {
		int tmp[] = new int[v.length];
		for (int i = izq; i <= der; i++) {
			tmp[i] = v[i];
		}
		int i = izq, j = media + 1, k = izq;
		while (i <= media && j <= der) {
			if (tmp[i] <= tmp[j]) {
				v[k++] = tmp[i++];
			} else {
				v[k++] = tmp[j++];
			}
		}
		while(i <= media) {
			v[k++] = tmp[i++];
		}
	}

	public static void reverseSort(int v[]) {
		reverseSort(v, 0, v.length - 1);
	}

	private static void reverseSort(int v[], int izq, int der) {
		if (izq < der) {
			int media = (izq + der) / 2;
			reverseSort(v, izq, media);
			reverseSort(v, media + 1, der);
			reverseMerge(v, izq, media, der);
		}
	}

	private static void reverseMerge(int[] v, int izq, int media, int der) {
		int tmp[] = new int[v.length];
		for (int i = izq; i <= der; i++) {
			tmp[i] = v[i];
		}
		int i = izq, j = media + 1, k = izq;
		while (i <= media && j <= der) {
			if (tmp[i] >= tmp[j]) {
				v[k++] = tmp[i++];
			} else {
				v[k++] = tmp[j++];
			}
		}
		while(i <= media) {
			v[k++] = tmp[i++];
		}
	}
	
}
