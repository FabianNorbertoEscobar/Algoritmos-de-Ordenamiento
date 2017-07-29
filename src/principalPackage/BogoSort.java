package principalPackage;

import java.util.Random;

public class BogoSort {

	public static void sort(int v[]) {
		Random rand = new Random();
		int random;
		while(!isSorted(v)) {
			for (int i = 0; i < v.length; i++) {
				random = rand.nextInt(v.length);
				intercambio(v, i, random);
			}
		}
	}

	private static boolean isSorted(int[] v) {
		for (int i = 1; i < v.length; i++) {
			if (v[i] < v[i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static void reverseSort(int v[]) {
		Random rand = new Random();
		int random;
		while(!isReverseSorted(v)) {
			for (int i = 0; i < v.length; i++) {
				random = rand.nextInt(v.length);
				intercambio(v, i, random);
			}
		}
	}
	
	private static boolean isReverseSorted(int[] v) {
		for (int i = 1; i < v.length; i++) {
			if (v[i] > v[i - 1]) {
				return false;
			}
		}
		return true;
	}

	private static void intercambio(int v[], int i, int j) {
		int aux = v[j];
		v[j] = v[i];
		v[i] = aux;
	}

}
