


public class CheckRoute {

	public static final int UNVISITED_NODES=0;
	public static final int VISITING = 1;
	public static final int VISITED = 2;
	
	boolean search(Graph g, Node start, Node end){
		Queue q=new Queue(15);
		for(Node u: g.getNodes()){
			u.state = UNVISITED_NODES;
		}
		start.state = VISITING;
		q.enQueue(start);
		Node e;
		while(!q.isEmpty()){
			e = q.deQueue();
			if(e!=null){
				for(Node u:e.getAdjacent()){
					if(u.state == UNVISITED_NODES){
						if(u == end){
							return true;
						}else{
							u.state = VISITING;
							q.enQueue(u);
						}
					}
				}
				e.state = VISITED;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node {
	    Node left;
	    Node right;
	    Object data;
	    int state;
	    Node[] adjacent;
	    public Node[] getAdjacent() {
			return adjacent;
		}
		public void setAdjacent(Node[] adjacent) {
			this.adjacent = adjacent;
		}
		public Node(Object data) {
	        this.data = data;
	    }
	}
	
	static class Graph{
		private Node[] vertices;
		public int count;
		public Graph(){
			vertices = new Node[6];
			count =0;
		}
		
		public void addNode(Node x){
			if(count < 30){
				vertices[count++] = x;
			}else
				System.out.println("Graph full");
		}
		
		public Node[] getNodes(){
			return vertices;
		}
	}
	
	static class Queue{
		private Node[] queue;
		int length,front,rear;
		public Queue(int length){
			this.length = length;
			queue = new Node[length];
			front =0;
			rear =0;
		}
		
		public Node deQueue(){
			if(isEmpty()){
				System.out.println("Queue is empty");
				return null;
			}else
				return queue[front++];
			
		}
		
		public void enQueue(Node e){
			if(rear == length)
				System.out.println("Queue is full");
			else
				queue[rear++] = e;
		}

		public boolean isEmpty() {
			// TODO Auto-generated method stub
			if(front>rear)
				return true;
			return false;
		}
	}

}
