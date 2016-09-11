package ch13.verify;

public class Container <K,V>{
	K key;
	V value;
	
	public K getkey() {
		return key;
	}
	
	public V getvalue() {
		return value;
	}
	
	public void set(K k,V v) {
		this.key = k;
		this.value = v;
	}
	
}
