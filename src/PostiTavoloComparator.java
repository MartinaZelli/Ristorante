import java.util.Comparator;

public class PostiTavoloComparator implements Comparator<Tavolo> {
	@Override
	public int compare(Tavolo o1, Tavolo o2) {
		int result;
		result = o1.getNumeroPostiASedere()-o2.getNumeroPostiASedere();
		return result;
	}

}
