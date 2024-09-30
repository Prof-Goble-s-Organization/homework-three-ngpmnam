package hw03;

public class CS232ArrayStack<T> implements CS232Stack<T>{
	
	private CS232ArrayList<T> arrayList;
	
	public CS232ArrayStack() {
		arrayList = new CS232ArrayList();
	}

	@Override
	public void push(T obj) {
		if(obj instanceof T) {
			arrayList.add(obj);
		}
	}

	@Override
	public T pop() {
		return arrayList.remove(arrayList.size() - 1);
	}

	@Override
	public T peek() {
		return arrayList.get(arrayList.size() - 1);
	}

	@Override
	public int size() {
		return arrayList.size();
	}
	
	
}
