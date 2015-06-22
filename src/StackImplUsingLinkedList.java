import java.util.LinkedList;


public class StackImplUsingLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int top;
	private LinkedList storage;
	
	
	
	public void push(int data) throws StackException{
		if(storage.size() == top){
			throw new StackException("The stack is full");
		}
		storage.add(top, data);
	}
	public void pop() throws StackException{
		if(storage.size()<0)
			throw new StackException("The stack is empty");
		top--;
	}
	
	

}
