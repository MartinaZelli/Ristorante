import java.security.cert.CollectionCertStoreParameters;
import java.util.Collections;
import java.util.Comparator;

public class Tavolo implements Comparable<Tavolo> {

	private int codiceTavolo;
	private int numeroPostiASedere;
	private boolean èPrenotato;

	public Tavolo(int codiceTavolo, int numeroPostiASedere) {
		this.codiceTavolo = codiceTavolo;
		this.numeroPostiASedere = numeroPostiASedere;
	}

	public int getCodiceTavolo() {
		return codiceTavolo;
	}

	public int getNumeroPostiASedere() {
		return numeroPostiASedere;
	}

	public boolean isèPrenotato() {
		return èPrenotato;
	}

	public void setNumeroPostiASedere(int numeroPostiASedere) {
		this.numeroPostiASedere = numeroPostiASedere;
	}

	@Override
	public int compareTo(Tavolo o) {
		int result;
		result = this.codiceTavolo - o.codiceTavolo;
		return result;

	}

	@Override
	public String toString() {
		return "Tavolo{" +
				"codiceTavolo=" + codiceTavolo +
				", numeroPostiASedere=" + numeroPostiASedere +
				", èPrenotato=" + èPrenotato +
				'}';
	}
}
