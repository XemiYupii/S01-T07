package exercici2;

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
	 
	@Deprecated
	public void onlineDeprecated() {
		System.out.println("Soc un treballador Online");
	}

	@Override
	public String toString() {
		return super.toString() +"  " +preuTarifaPlanaInternet;
	}
	

}
