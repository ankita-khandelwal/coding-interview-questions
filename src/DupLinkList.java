import java.util.HashMap;




public class DupLinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		Node next1 = new Node(18);
		head.next = next1;
		Node next2 = new Node(9);
		next1.next = next2;
		Node next3 = new Node(9);
		next2.next = next3;
		Node head1 = findDup(head);
		while(head1.next!=null){
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static Node findDup(Node head){
		HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		Node root = head;
		Node previous = null;
		while(head.next!=null){
			if(map.containsKey(head.data)){
				previous.next = head.next;
			}else{
				map.put(Integer.parseInt(head.data.toString()), true);
				previous = head;
			}
			head = head.next;
		}
		return root;
	}
	
	public static void fndDup(Node head){
		Node current =head;
		Node last = head;
		if(current == null)
			return;
		current = last.next;
		while(current!=null){
			Node runner = head;
			while(runner!=current){
				if(runner.data==current.data){
					Node tmp = current.next;
					last.next = current = tmp;
					break;
				}
				runner = runner.next;
			}
			if(runner == current){
				last = current;
				current = current.next;
			}
		}
		
	}
	
	public static class Node {
	    Node next;
	    Object data;
	    public Node(Object data) {
	        this.data = data;
	    }
	}
}
