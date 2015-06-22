import java.util.Arrays;


public class AddToSomeValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,4,5,6,6,6,7};
		findPair(a,10);
	}
	
	public static void findPair(int[] array, int x){
		if(array == null || array.length<2)
			return;
		int left =0;
		int right = array.length -1;
		Arrays.sort(array);
		int nextR=0;
		int nextL=0;
		while(left<right){
			int sum = array[left] + array[right];
			if(sum == x){
				System.out.println("Pairs "+left+" and "+right);
				nextR = right-1;
				while(array[nextR+1] == array[nextR]){
					nextR = right -1;
					System.out.println("Pairs "+left+" and "+nextR);
				}
				nextL = left+1;
				while(array[nextL-1] == array[nextL]){
					nextL = left+1;
					System.out.println("Pairs "+nextL+" and "+right);
				}
				left = nextL + left;
				right = right - nextR;
			}else if(sum < x)
				left++;
			else
				right--;
		}
	}

}
