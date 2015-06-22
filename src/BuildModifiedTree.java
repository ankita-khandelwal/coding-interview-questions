
public class BuildModifiedTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static class Node{
		Node left;
		Node right;
		int key;
		Node(int data){
			this.key = data;
		}
	}
	  private Node SumTree(Node root)
      {
          if (root == null) return null;


if (root.left == null && root.right == null)
              return new Node(0);



Node left = SumTree(root.left);
          Node right = SumTree(root.right);



int sum = left.key + right.key + root.left.key + root.right.key;



Node newroot = new Node(sum);
          newroot.left = left;
          newroot.right = right;



return newroot;



}

}
