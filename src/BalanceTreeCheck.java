


public class BalanceTreeCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxDepth(Node root){
		if(root == null)
			return 0;
		return 1+Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
	}
	
	public int minDepth(Node root){
		if(root == null)
			return 0;
		return 1+Math.min(minDepth(root.getLeft()), minDepth(root.getRight()));
	}
	
	public boolean isBalanced(Node root){
		return maxDepth(root)-minDepth(root)<=1;
	}
	
	public static class Node {
	    Node left;
	    Node right;
	    Object data;
	    public Node(Object data) {
	        this.data = data;
	    }
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
	}

}
