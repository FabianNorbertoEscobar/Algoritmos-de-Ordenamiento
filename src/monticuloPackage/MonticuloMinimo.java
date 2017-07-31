package monticuloPackage;

public class MonticuloMinimo extends Monticulo {

	public MonticuloMinimo(int tama�oMaximo) {
		super(tama�oMaximo);
		this.nodo[0] = Integer.MIN_VALUE;
	}

	@Override
	protected boolean condicion(int hijo, int padre) {
		return this.nodo[hijo] >= this.nodo[padre];
	}
	
}
