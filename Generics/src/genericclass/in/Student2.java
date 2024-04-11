package genericclass.in;

public class Student2<K,V> {
	
	private K key;
	private V value;
	public Student2(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	
	

}
