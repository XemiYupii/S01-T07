package exercici1;

public class App {

	public static void main(String[] args) {
		
		
		 Treballador treballador = new Treballador ("Gemma", "Zamora", 7.6);
		System.out.println(treballador);
		System.out.println(treballador.calcularSou(240));
		
		Treballador treballador2 = new TreballadorOnline ("Jordi", "Torrent", 3.2, 9);
		System.out.println(treballador2);
		System.out.println(treballador2.calcularSou(240));
		
		
		Treballador treballador3 = new TreballadorPresencial ("Julia", "Torrent", 7.6);
		System.out.println(treballador3);
		System.out.println(treballador3.calcularSou(240));
		}

}
