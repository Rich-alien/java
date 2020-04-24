package Task2;

public class Util {
	public static <K,V> boolean compare(Pair<String, String> p1, Pair<String, String> p2){
		return p1.getKey().equals(p2.getKey())&&
				p1.getValue().equals(p2.getValue());
	}
}
