import java.util.LinkedList;
import java.util.Queue;



public class TreeSubtree {

	private TreeNode root;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSubtree t1 = new TreeSubtree("abcdefghijk");
		TreeSubtree t2 = new TreeSubtree("b");
		if(t1.containsTree(t2)){
			System.out.println("It is a subtree");
		}else
			System.out.println("It is not a subtree");

	}
	
	private boolean containsTree(TreeSubtree t2){
		if(t2.root == null){
			return true;
		}else
			return subTree(root,t2.root);
	}
	
	private boolean subTree(TreeNode root,TreeNode root1){
		if(root == null)
			return false;
		else if(root.data == root1.data){
			if(matchTree(root, root1)) return true;
		}
		return (subTree(root.left,root1)||subTree(root.right,root1));
	}

	private boolean matchTree(TreeNode r1,TreeNode r2){
		if(r2 == null)
			return true;
		if(r1 == null)
			return false;
		if(r1.data!=r2.data)
			return false;
		return (matchTree(r1.left,r2.left) && matchTree(r1.right,r2.right));
	}
	
		public TreeSubtree(String s){
			if(s.length()>0){
				root = new TreeNode(s.charAt(0));
				Queue<TreeNode> queue = new LinkedList<TreeNode>();
				queue.add(root);
				boolean done = false;
				if(s.length()>1){
				int i=1;
				while(!done){
					TreeNode r = (TreeNode) queue.element();
					if(r.left == null){
						r.left = new TreeNode(s.charAt(i));
						queue.add(r.left);
						i++;
					}else if(r.right==null){
						r.right = new TreeNode(s.charAt(i));
						queue.add(r.right);
						i++;
					}else{
						queue.remove();
					}
					if(i == s.length())done =true;
				}
				}
			}else{
				root =null;
			}
		}
		
		private class TreeNode{
			private char data;
			private TreeNode left;
			private TreeNode right;
			
			public TreeNode(char c){
				data = c;
			}
		}
	
}
