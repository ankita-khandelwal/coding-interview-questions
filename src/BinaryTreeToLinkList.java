import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;




public class BinaryTreeToLinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static class Node {
	    Node left=null;
	    Node right = null;
	    int data;
	    public Node(int data) {
	        this.data = data;
	    }
	}
	
	public static class BinaryTree{
		public Node addToBinaryTree(Node node, int value){
			if(node == null){
				node = new Node(value);
				return node;
			}
			if(value<=node.data){
				node.left = addToBinaryTree(node.left,value); 
			}else {
				node.right = addToBinaryTree(node.right, value);
			}
			return node;
		}
	}
	
	public static class BFS{
		public ArrayList<LinkedList<Node>> findLevelLinkList(Node head){
			int level = 0;
			ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
			LinkedList<Node> list = new LinkedList<Node>();
			list.add(head);
			result.add(level,list);
			while(true){
				list = new LinkedList<Node>();
				for(int i=0;i<result.get(level).size();i++){
					Node n = (Node)result.get(level).get(i);
					if(n!=null){
						if(n.left!=null) list.add(n.left);
						if(n.right!=null) list.add(n.right);
					}
				}
				if(list.size()>0){
					result.add(level+1,list);
				}else{
					break;
				}
				level++;
			}
			return result;
		}
		public static void printResult(ArrayList<LinkedList<Node>> result){
			int depth = 0;
			for(LinkedList<Node> list:result){
				Iterator<Node> i = list.listIterator();
				System.out.println("Link list at depth "+depth+": ");
				while(i.hasNext()){
					System.out.println(" "+((Node)i.next()).data);
				}
				System.out.println();
				depth++;
			}
		}
	}

}
