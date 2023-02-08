package exercici2;

public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		TreballadorPresencial presencial = new TreballadorPresencial ("Gemma", "Zamora", 7.9);
		presencial.presencialDeprecated();
		
		TreballadorOnline online = new TreballadorOnline ("Jordi", "Torrent", 11.2, 5d);
		online.onlineDeprecated();
	}

}
