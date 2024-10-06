package hw03;

public class Pair<T1, T2> {
	private T1 firstValue;
	private T2 secondValue;
	
	public Pair(T1 first, T2 second) {
		firstValue = first;
		secondValue = second;
	}
	
	public void setFirst(T1 newFirst) {
		firstValue = newFirst;
	}
	
	public T1 getFirst() {
		return firstValue;
	}
	
	public void setSecond(T2 newSecond) {
		secondValue = newSecond;
	}
	
	public T2 getSecond() {
		return secondValue;
	}
	
	public static void main(String[] args) {
		Pair<Integer, Integer> intPair = new Pair(10, 100);
		Pair<Double, String> mixPair = new Pair(9.10, "Hello World!");
		Pair<Pair, Pair> pairPair = new Pair(intPair, mixPair);
		
		System.out.println(mixPair.getClass());
	}
}
