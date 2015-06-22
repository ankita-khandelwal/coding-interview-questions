

public class BinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Node addToTree(int[] arr, int start, int end){
		if(end<start)
			return null;
		int mid = (start+end)/2;
		Node n = new Node(arr[mid]);
		n.left = addToTree(arr,start,mid-1);
		n.right = addToTree(arr, mid+1, end);
		return n;
		
	}
	
	public static class Node {
	    Node left;
	    Node right;
	    Object data;
	    public Node(Object data) {
	        this.data = data;
	    }
	}

}
