import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MetodiRistorante{

	//controlla se il tavolo (codice) è presente nel ristorante e restituisce Tavolo se è presente oppure null
	private static Tavolo èpresente( int codiceTavolo, Ristorante ristorante){
		for(Tavolo tavolo: ristorante.getListaTavoliRistorante() ){
			if (tavolo.getCodiceTavolo()==codiceTavolo){
				return tavolo;
			}
		}
		return null;
	}

	// se presente elimina tavolo (codice) dichiarato dal ristorante, restituisce listaTavoliRistorante.
	public static List<Tavolo> eliminaTavolo (int codiceTavoloDaEliminare, Ristorante ristorante){
		Tavolo tavoloDaEliminare = èpresente(codiceTavoloDaEliminare,ristorante);
		if(tavoloDaEliminare!=null){
			ristorante.getListaTavoliRistorante().remove(tavoloDaEliminare);
			return ristorante.getListaTavoliRistorante();
			}
		return ristorante.getListaTavoliRistorante();
	}

	//aggiunge in Ordine nuovo tavolo (codice+posti) al ristorante se non trova tavoli con stessi codiciTavolo, restituisce listaTavoliRistorante.
	public static List<Tavolo> aggiungiTavolo (int codiceTavoloDaAggiungere, int postiASedere, Ristorante ristorante){
			if(èpresente(codiceTavoloDaAggiungere,ristorante)!=null){
				return ristorante.getListaTavoliRistorante();
			}
		Tavolo tavoloDaAggiungere = new Tavolo(codiceTavoloDaAggiungere,postiASedere);
		ristorante.getListaTavoliRistorante().add(tavoloDaAggiungere);
		Collections.sort(ristorante.getListaTavoliRistorante());
		return ristorante.getListaTavoliRistorante();
	}

	//tipo modifica: in Ordine cancella un "vecchio" tavolo con postiATavola diversi da un "nuovo"
	// e aggiunge il "nuovo" tavolo, restituisce listaTavoliRistorante.
	public static List<Tavolo> modificaTavolo (int codiceTavoloDaModificare, int postiASedereNuovi, Ristorante ristorante){
		Tavolo tavoloDaEliminare = èpresente(codiceTavoloDaModificare,ristorante);
			if(tavoloDaEliminare !=null){
				eliminaTavolo(tavoloDaEliminare.getCodiceTavolo(),ristorante);
			}
		aggiungiTavolo(codiceTavoloDaModificare,postiASedereNuovi,ristorante);
		Collections.sort(ristorante.getListaTavoliRistorante());
		return ristorante.getListaTavoliRistorante();
	}
}
