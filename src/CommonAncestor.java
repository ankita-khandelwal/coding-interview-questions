


public class CommonAncestor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Tree commonAncestor(Tree root, Tree p, Tree q){
		if(covers(root.left,p) && covers(root.left,q))
			return commonAncestor(root.left, p, q);
		if(covers(root.right,p) && covers(root.right, q))
			return commonAncestor(root.right, p, q);
		return root;
	}

	private boolean covers(Tree root, Tree p) {
		// TODO Auto-generated method stub
		if(root == null) return false;
		if(root == p) return true;
		return covers(root.left,p) || covers(root.right,p);
	}

	public static class Tree {
	    Tree left;
	    Tree right;
	    Object data;
	    public Tree(Object data) {
	        this.data = data;
	    }
	}
}
