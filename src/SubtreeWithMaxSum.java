import java.util.LinkedList;
import java.util.Queue;


public class SubtreeWithMaxSum {

	
	
	static class Node{
		Node left;
		Node right;
		int value;
		Node(){
			
		}
		Node(int data){
			this.value = data;
		}
	}
	 static class Result {
	      int value;
	      Node node;
	      Result(int value,Node node){
	    	  this.value = value;
	    	  this.node = node;
	      }
	   } 
	   
	   int sumOfTree(Node root, Result max) {
	      if (root == null) {
	         return 0;
	      }
	      int leftR = sumOfTree(root.left, max);
	      int rightR = sumOfTree(root.right, max);
	      int sum = leftR + rightR + root.value;
	      if (sum > max.value) {
	         max.value = sum;
	         max.node = root;
	      } 
	      return sum;
	   }
	   
	   public static void main(String[] args) {
	     Node root = new Node(); //create a tree
	      Result max = new Result(Integer.MIN_VALUE, root);
	      new SubtreeWithMaxSum().sumOfTree(root, max);
	      
	   }

}
