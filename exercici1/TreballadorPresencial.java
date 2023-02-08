package exercici1;

public class TreballadorPresencial extends Treballador {
	
	private static double benzina = 4.5;

	public TreballadorPresencial(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora);
	}

	@Override
	public double calcularSou(int hores) {
		return super.calcularSou(hores) + benzina;
	}

	@Override
	public String toString() {
		return super.toString() +"  " +benzina;
	}

}
