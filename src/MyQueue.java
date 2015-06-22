import java.util.Stack;


public class MyQueue<T> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Stack<T> s1 = new Stack<T>();
	Stack<T> s2 = new Stack<T>();
	public MyQueue(){
		s1 = new Stack<T>();
		s2 = new Stack<T>();
	}
	
	public void insert(T value){
		s1.push(value);
	}
	
	public T peek(){
		if(!s2.isEmpty()){
			return s2.peek();
		}
		return s1.peek();
	}
	
	public T deQueue(){
		if(!s2.isEmpty()){
			return s2.pop();
		}
		if(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		return s2.pop();
	}
}
