import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;




public class AddLinkLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static LinkedList<Integer> addLists(LinkedList<Integer> list1, LinkedList<Integer> list2){
		
		ListIterator<Integer> iterator1 = list1.listIterator();
		ListIterator<Integer> iterator2 = list2.listIterator();
		int i=0;
		//int j =0;
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> result = new Stack<Integer>();
		while(iterator1.hasNext()){
			stack1.push(iterator1.next());
			
		}
		while(iterator2.hasNext()){
			stack2.push(iterator2.next());
			
		}
		LinkedList<Integer> resultList = new LinkedList<Integer>();
		int carry = 0;
		//int i=0;
		while(!stack1.isEmpty() && !stack2.isEmpty()){
			int sum = stack1.pop()+stack2.pop()+carry;
			result.push(sum%10);
			carry = sum/10;
		}
		while(!stack1.isEmpty()){
			int sum = stack1.pop()+carry;
			result.push(sum%10);
			carry = sum/10;
		}
		while(!stack2.isEmpty()){
			int sum = stack2.pop()+carry;
			result.push(sum%10);
			carry = sum/10;
		}
		while(!result.isEmpty()){
			resultList.add(result.pop());
		}
		return resultList;
	}
	
	public static void printResult(LinkedList<Integer> result){
		ListIterator<Integer> iter = result.listIterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}
}
