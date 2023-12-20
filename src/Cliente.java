public class Cliente {

	private String nomeCliente;
	private String cognomeCliente;
	private int numeroPostiRichiesti;
	private Long numeroTelefono;
	private boolean prenotazioneAccettata;

	private Cliente(){}

	//modifica prenotazione: se non è presente la prenotazione aggiunge la nuova prenotazione;
	// se è presente modifica i canoni dati e restituisce lista.
	public static CodaClienti modificaPostiPrenotazione (String cognome, int numeroPostiRichiesti){
		CodaClienti coda = CodaClienti.codaClienti();
		Cliente clienteDaModificare = Cliente.èpresente(cognome);
		if(clienteDaModificare == null){
			Cliente clienteDaAggiungere = new Cliente.Builder(cognome,numeroPostiRichiesti).build();
			Cliente.aggiungiClienteInCoda(clienteDaAggiungere);
			return coda;
		}
		for (int cliente = 0; cliente <coda.getClientiInCoda().size() ; cliente++) {
			if (coda.getClientiInCoda().get(cliente).getCognomeCliente().equals(cognome)){
				coda.getClientiInCoda().get(cliente).setNumeroPostiRichiesti(numeroPostiRichiesti);
				break;
			}
		}
		return coda;
	}

	//controlla se il Cliente (cognome) è presente nella coda e restituisce Cliente se è presente oppure null
	private static Cliente èpresente(String cognome){
		CodaClienti coda = CodaClienti.codaClienti();
		for(Cliente cliente: coda.getClientiInCoda()){
			if (cliente.getCognomeCliente().equals(cognome)){
				return cliente;
			}
		}
		return null;
	}

	// se presente elimina il Cliente (cognome) dichiarato dalla coda , restituisce codaClienti.
	public static CodaClienti eliminaCliente ( String cognome){
		Cliente clienteDaEliminare = èpresente(cognome);
		CodaClienti coda = CodaClienti.codaClienti();
		if(coda.getClientiInCoda().getFirst()==null) {
			return null;
		}
		if(clienteDaEliminare!=null){
			coda.getClientiInCoda().remove(clienteDaEliminare);
		}
		return coda;
	}

	// se non è presente aggiunge il Cliente (cognome) dichiarato dalla coda, restituisce codaClienti.
	public static CodaClienti aggiungiClienteInCoda (Cliente clienteDaAggiungere) {
		CodaClienti coda = CodaClienti.codaClienti();
		if (èpresente(clienteDaAggiungere.getCognomeCliente()) != null) {
			return coda;
		}
		coda.getClientiInCoda().add(clienteDaAggiungere);
		return coda;
	}

	private void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	private void setCognomeCliente(String cognomeCliente) {
		this.cognomeCliente = cognomeCliente;
	}

	private void setNumeroPostiRichiesti(int numeroPostiRichiesti) {
		this.numeroPostiRichiesti = numeroPostiRichiesti;
	}

	private void setNumeroTelefono(Long numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	private void setPrenotazioneAccettata(boolean prenotazioneAccettata) {
		this.prenotazioneAccettata = prenotazioneAccettata;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	public String getCognomeCliente() {
		return cognomeCliente;
	}
	public int getNumeroPostiRichiesti() {
		return numeroPostiRichiesti;
	}
	public Long getNumeroTelefono() {
		return numeroTelefono;
	}
	public boolean isPrenotazioneAccettata() {
		return prenotazioneAccettata;
	}


	public static class Builder{
		private String nomeCliente;
		private String cognomeCliente;
		private int numeroPostiRichiesti;
		private Long numeroTelefono;
		private boolean prenotazioneAccettata;

		public Builder(String cognomeCliente, int numeroPostiRichiesti){
			this.cognomeCliente=cognomeCliente;
			this.numeroPostiRichiesti=numeroPostiRichiesti;
			this.nomeCliente=null;
			this.numeroTelefono=null;
			this.prenotazioneAccettata=false;
		}

		public Cliente build(){
			Cliente cliente = new Cliente();
			cliente.cognomeCliente=this.cognomeCliente;
			cliente.nomeCliente=this.nomeCliente;
			cliente.numeroPostiRichiesti=this.numeroPostiRichiesti;
			cliente.numeroTelefono=this.numeroTelefono;
			cliente.prenotazioneAccettata=this.prenotazioneAccettata;
			return cliente;
		}

		public Builder setNomeCliente(String nomeCliente) {
			this.nomeCliente  = nomeCliente;
			return this;
		}

		public Builder setCognomeCliente(String cognomeCliente) {
			this.cognomeCliente = cognomeCliente;
			return this;
		}

		public Builder setNumeroPostiRichiesti(int numeroPostiRichiesti) {
			this.numeroPostiRichiesti = numeroPostiRichiesti;
			return this;
		}

		public Builder setNumeroTelefono(Long numeroTelefono) {
			this.numeroTelefono = numeroTelefono;
			return this;
		}
	}

	@Override
	public String toString() {
		return "Cliente{" +
				", cognome='" + cognomeCliente + '\'' +
				", PostiRichiesti=" + numeroPostiRichiesti +
				" Informazioni aggiuntive:" +
				", nome='" + nomeCliente + '\'' +
				", Telefono=" + numeroTelefono +
				", prenotazioneAccettata=" + prenotazioneAccettata +
				'}';
	}


}
