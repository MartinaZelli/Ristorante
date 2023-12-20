import java.util.LinkedList;
import java.util.List;

public class CodaClienti {

	private LinkedList<Cliente> clientiInCoda = new LinkedList<>();
	private final static CodaClienti coda = new CodaClienti();

	public static CodaClienti codaClienti(){
		return coda;
	}

	public LinkedList<Cliente> getClientiInCoda() {
		return clientiInCoda;
	}
}
