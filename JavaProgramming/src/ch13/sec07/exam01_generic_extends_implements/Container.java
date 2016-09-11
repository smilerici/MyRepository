package ch13.sec07.exam01_generic_extends_implements;

public class Container<T> {
	T name;
	
	public Container() {
	
	}

	public T get() {
		return name;
	}

	public void set(T name) {
		this.name = name;
	}
	
	
}
