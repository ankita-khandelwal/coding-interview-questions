


public class nthElementLinkList {

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
		Node next3 = new Node(10);
		next2.next = next3;
		System.out.println(findNthElem(head,2).data);
	}
	
	public static class Node {
	    Node next;
	    Object data;
	    public Node(Object data) {
	        this.data = data;
	    }
	}
	public static Node findNthElem(Node head,int n){
		if(head == null || n<1)
			throw new NumberFormatException();
		Node p1 = head;
		Node p2 = head;
		for(int i=0; i<n-1;i++){
			if(p2 == null){
				throw new NumberFormatException();
			}
			p2 = p2.next;
		}
		while(p2.next!=null){
			p1 = p1.next;
			p2=p2.next;
		}
		return p1;
	}

}
