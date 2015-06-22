


public class MiddleAccessLinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n5 = new Node(5, null); 
		Node n4 = new Node(4, n5); 
		Node n3 = new Node(3, n4); 
		System.out.println(deleteMiddle(n4));
	}
	
	public static boolean deleteMiddle(Node middle){
		if(middle == null || middle.next==null){
			return false;
		}
		Node next = middle.next;
		middle.data = next.data;
		middle.next = next.next;
		//middle = middle.next;
		return true;
	}
	
	public static class Node {
	    Node next;
	    int data;
	    public Node(int data, Node next) {
	        this.data = data;
	        this.next = next;
	    }
	}

}
