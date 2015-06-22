
public class DIV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {9,4,-3,-10};
		System.out.println(count_div(A));
	}
	public static int count_div(int[] A){
		int total=0;
		int avg=0;
		int extreme=0;
		int index=0;
		if(A.length!=0){
			for(int i:A){
				total+=i;
			}
			avg = total/A.length;
			for(int i=0;i<A.length;i++){
				
				int diff = Math.abs(A[i] - avg);
				if(extreme<diff){
					extreme = diff;
					index = i;
				}
			}
			return index;
		}
		return -1;
	}

}
