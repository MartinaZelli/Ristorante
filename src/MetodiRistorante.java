import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MetodiRistorante{

	// se presente elimina tavolo (codice) dichiarato dal ristorante, restituisce listaTavoliRistorante.
	public static List<Tavolo> eliminaTavolo (int codiceTavoloDaEliminare, Ristorante ristorante){
		for(Tavolo tavolo: ristorante.getListaTavoliRistorante() ){
			if(codiceTavoloDaEliminare==tavolo.getCodiceTavolo()){
				ristorante.getListaTavoliRistorante().remove(tavolo);
				return ristorante.getListaTavoliRistorante();
			}
		}
		return ristorante.getListaTavoliRistorante();
	}

	//controlla se il tavolo (codice) è presente nel ristorante e restituisce True se è presente
	private static boolean èpresente( int codiceTavolo, Ristorante ristorante){
		for(Tavolo tavolo: ristorante.getListaTavoliRistorante() ){
			if (tavolo.getCodiceTavolo()==codiceTavolo){
				return true;
			}
		}
		return false;
	}

	//aggiunge in Ordine nuovo tavolo (codice+posti) al ristorante se non trova tavoli con stessi codiciTavolo, restituisce listaTavoliRistorante.
	public static List<Tavolo> aggiungiTavolo (int codiceTavoloDaAggiungere, int postiASedere, Ristorante ristorante){
		for(Tavolo tavolo: ristorante.getListaTavoliRistorante() ){
			if(èpresente(codiceTavoloDaAggiungere,ristorante)){
				return ristorante.getListaTavoliRistorante();
			}
		}
		Tavolo tavoloDaAggiungere = new Tavolo(codiceTavoloDaAggiungere,postiASedere);
		ristorante.getListaTavoliRistorante().add(tavoloDaAggiungere);
		Collections.sort(ristorante.getListaTavoliRistorante());
		return ristorante.getListaTavoliRistorante();
	}

	//tipo modifica: in Ordine cancella un "vecchio" tavolo con postiATavola diversi da un "nuovo"
	// e aggiunge il "nuovo" tavolo, restituisce listaTavoliRistorante.
	public static List<Tavolo> modificaTavolo (int codiceTavoloDaModificare, int postiASedereNuovi, Ristorante ristorante){
		for(Tavolo tavolo: ristorante.getListaTavoliRistorante() ){
			if(èpresente(codiceTavoloDaModificare,ristorante)){
				eliminaTavolo(tavolo.getCodiceTavolo(),ristorante);
			}
		}
		aggiungiTavolo(codiceTavoloDaModificare,postiASedereNuovi,ristorante);
		Collections.sort(ristorante.getListaTavoliRistorante());
		return ristorante.getListaTavoliRistorante();
	}
}
