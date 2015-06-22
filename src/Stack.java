import java.util.ArrayList;
import java.util.List;


public class Stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int top;
	List list;
	public Stack(){
		list = new ArrayList();
		top=-1;
	}
	
	void pop() throws StackException{
		if(list.size()<0){
			throw new StackException("Stack is empty");
		}
		top--;
	}
	
	void push(int data) throws StackException{
		if(top == list.size())
			throw new StackException("Stack is full");
		top++;
		list.add(top, data);
	}
	
	

}
