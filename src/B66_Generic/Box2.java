package B66_Generic;

public class Box2<T> {// TRUYỀN GENERIC 
	private T value;
	
	public Box2(T value) {
		this.value = value;
		
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
	
	
}
