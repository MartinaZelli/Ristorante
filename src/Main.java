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
		CodaClienti coda = CodaClienti.codaClienti();
	Cliente cliente1 = new Cliente.Builder("rossi",5).setNomeCliente("mario").setNumeroTelefono(353654987L).build();
	Cliente cliente2 = new Cliente.Builder("bianchi",2).build();
	Cliente cliente3 = new Cliente.Builder("neri",3).setNomeCliente("Gianni").build();
	Cliente cliente4 = new Cliente.Builder("gialli",10).build();
	Cliente cliente5 = new Cliente.Builder("verdi",8).setNumeroTelefono(353456123L).build();
	Cliente cliente6 = new Cliente.Builder("grigi",2).build();

	Cliente.aggiungiClienteInCoda(cliente1);
	Cliente.aggiungiClienteInCoda(cliente2);
	Cliente.aggiungiClienteInCoda(cliente3);
	Cliente.eliminaCliente("bianchi");
	Cliente.aggiungiClienteInCoda(cliente4);
	Cliente.aggiungiClienteInCoda(cliente5);
	Cliente.aggiungiClienteInCoda(cliente6);
	Cliente.modificaPostiPrenotazione("gialli",4);
	Cliente.modificaPostiPrenotazione("rosa",4);




	for (Cliente cliente : CodaClienti.codaClienti().getClientiInCoda()){

			System.out.println(cliente);

		}
	}
}