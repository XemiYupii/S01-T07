package exercici1;

public class TreballadorOnline extends Treballador {
	
	private final double preuTarifaPlanaInternet;
	
	public TreballadorOnline (String nom, String cognom, double preuHora, double preuTarifaPlanaInternet) {
		super(nom, cognom, preuHora);
		this.preuTarifaPlanaInternet = preuTarifaPlanaInternet;
	}

	@Override
	public double calcularSou(int hores) {
		return super.calcularSou(hores) + preuTarifaPlanaInternet;
	}
	public double getPreuTarifaPlanaInternet() {
		return preuTarifaPlanaInternet;
	}
	@Override
	public String toString() {
		return super.toString() +"  " +preuTarifaPlanaInternet;
	}
	

}
