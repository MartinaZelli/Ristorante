public class Main {
	public static void main(String[] args) {
		System.out.println("hello");

Ristorante risto = new Ristorante();
MetodiRistorante.aggiungiTavolo(1,5,risto);
MetodiRistorante.eliminaTavolo(1,risto);
MetodiRistorante.aggiungiTavolo(3,10,risto);
MetodiRistorante.aggiungiTavolo(2,4,risto);
MetodiRistorante.aggiungiTavolo(6,8,risto);
MetodiRistorante.modificaTavolo(5,5,risto);
MetodiRistorante.modificaTavolo(3,5,risto);
for (Tavolo tavolo : risto.getListaTavoliRistorante()){

	System.out.println(tavolo);

}

	}
}