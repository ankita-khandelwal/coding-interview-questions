


public class InOrderSuccessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Node inorderSuccessor(Node e){
		if(e!=null){
			Node p;
			if(e.parent==null || e.right!=null)
				p = leftMostChild(e.right);
			else{
				while((p=e.parent)!=null){
					if(p.left == e){
						break;
					}
					e=p;
				}
			}
			return p;
		}
		return null;
	}
	
	private static Node leftMostChild(Node e) {
		// TODO Auto-generated method stub
		while(e.left!=null) e = e.left;
		return e;
	}

	public static class Node {
	    Node parent;
	    Node right;
	    Node left;
	    Object data;
	    public Node(Object data) {
	        this.data = data;
	    }
	}

}
