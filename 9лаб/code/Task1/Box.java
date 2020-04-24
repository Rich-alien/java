package Task1;

public class Box<T> {
	private T t;

	public T get ( ) {
		return t;
	}

	public void set (T t) {
		this.t = t;
	}
	public <U extends Number> void inspect (U u){
		System.out.println("Т: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}
}
