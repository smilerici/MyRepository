package ch13.verify;

public class Util {
	//how1
	/*public static <K,V> V getValue(Pair<K,V> pair, K key) {
		if(pair.getKey() == key) {
			return pair.getValue();
		}
		return null;
	}*/
	
	//how2
	public static <P extends Pair<K,V>,K,V> V getValue(P pair, K key) {
		if(pair.getKey() == key) {
			return pair.getValue();
		}
		return null;
	}
}
