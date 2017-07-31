package monticuloPackage;

public abstract class Monticulo {

	protected int[] nodo;
	protected int tama�o;
	
	private static final int RAIZ = 1;
	
	public Monticulo(int tama�oMaximo) {
		this.tama�o = 0;
		this.nodo = new int[tama�oMaximo + 1];
	}
	
	private int padre(int i) {
		return i / 2;
	}
	
	private int hijoIzquierdo(int i) {
		return 2 * i;
	}
	
	private int hijoDerecho(int i) {
		return 2 * i + 1;
	}
	
	private boolean tieneHijoIzquierdo(int i) {
		return this.hijoIzquierdo(i) <= this.tama�o;
	}
	
	private boolean tieneHijoDerecho(int i) {
		return this.hijoDerecho(i) <= this.tama�o;
	}
	
	private boolean tieneHijoUnico(int i) {
		return this.tieneHijoIzquierdo(i) && !this.tieneHijoDerecho(i);
	}
	
	public boolean estaVacio() {
		return this.tama�o == 0;
	}
	
	public boolean estaLleno() {
		return this.tama�o == this.nodo.length - 1;
	}
	
	protected boolean esHoja(int i) {
		return !this.tieneHijoIzquierdo(i) && !this.tieneHijoDerecho(i);
	}
	
	protected void intercambiar(int i, int j) {
		int tmp = this.nodo[i];
		this.nodo[i] = this.nodo[j];
		this.nodo[j] = tmp;
	}
	
	private void montar() {
		for (int i = this.tama�o / 2; i >= 1; i--) {
			this.hundir(i);
		}
	}
	
	private void flotar(int actual) {
		while (!this.condicion(actual, this.padre(actual))) {
			this.intercambiar(actual, this.padre(actual));
			actual = this.padre(actual);
		}
	}
	
	private void hundir(int i) {
		if (!this.esHoja(i)) {
			if (!this.tieneHijoUnico(i)) {
				if (!this.condicion(this.hijoIzquierdo(i), i) || !this.condicion(this.hijoDerecho(i), i)) {
					if (!this.condicion(this.hijoIzquierdo(i), this.hijoDerecho(i))) {
						this.intercambiar(i, this.hijoIzquierdo(i));
						this.hundir(this.hijoIzquierdo(i));
					} else {
						this.intercambiar(this.hijoDerecho(i), i);
						this.hundir(this.hijoDerecho(i));
					}
				}
			} else {
				if (!this.condicion(this.hijoIzquierdo(i), i)) {
					this.intercambiar(i, this.hijoIzquierdo(i));
					this.hundir(this.hijoIzquierdo(i));
				}
			}
		}
	}
	
	protected abstract boolean condicion(int hijo, int padre);
	
	public void insertar(int nuevo) {
		if (!this.estaLleno()) {
			this.nodo[++this.tama�o] = nuevo;
			this.flotar(this.tama�o);
			this.montar();
		}
	}

	public int eliminar() {
		if (!this.estaVacio()) {
			int nodo = this.nodo[RAIZ];
			this.nodo[RAIZ] = this.nodo[this.tama�o--];
			this.hundir(RAIZ);
			return nodo;
		} else {
			return this.nodo[0];
		}
	}
	
	public int pispear() {
		if (!this.estaVacio()) {
			return this.nodo[RAIZ];
		} else {
			return this.nodo[0];
		}
	}
	
	public void mostrar() {
		for (int i = 1; i <= this.tama�o / 2; i++) {
			System.out.print("Padre: " + this.nodo[i]);
			if (this.tieneHijoIzquierdo(i)) {
				System.out.print(" HijoIzquierdo: " + this.nodo[2 * i]);
			}
			if (this.tieneHijoDerecho(i)) {
				System.out.print(" HijoDerecho: " + this.nodo[2 * i + 1]);
			}
			System.out.println();
		}
	}
	
}
