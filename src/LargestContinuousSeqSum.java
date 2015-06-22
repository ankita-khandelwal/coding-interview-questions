
public class LargestContinuousSeqSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seq = {-8,-2,-10};
		largestSum(seq);
	}
	public static void largestSum(int[] seq){
		int sum=0;
		int maxSum=0;
		for(int num:seq){
			sum+=num;
			if(maxSum<sum){
				maxSum = sum;
			}
			if(sum<0)
				sum=0;
		}
		System.out.println(maxSum);
	}

}
