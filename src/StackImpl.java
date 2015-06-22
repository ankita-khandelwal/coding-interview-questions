
public class StackImpl {

	
	private int top;
	private int[] storage;
	public StackImpl(int capacity){
		if(capacity<0)
			throw new IllegalArgumentException("Stacks capacity must be positive");
		storage = new int[capacity];
	}
	
	public void push(int data) {
		if(storage.length == top){
			throw new StackException("The stack is full");
		}
		top++;
		storage[top] = data;
	}
	
	void pop(){
		if(storage.length<0){
			throw new StackException("The stack is empty");
		}
		top--;
	}
	public class StackException extends RuntimeException {
        public StackException(String message) {
              super(message);
        }
  }
	int peek() {
		if(storage.length<0){
			throw new StackException("The stack is empty");
		}
		return storage[top];
	}
	boolean isEmpty(){
		return top == -1;
	}

}
