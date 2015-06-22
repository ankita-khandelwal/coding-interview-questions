
public class FindMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMax(2,1));
	}
	public static int findMax(int a,int b){
		int c = a-b;
		int k = (c>>31) & 0x1;
		int max = a - (k*c);
		return max;
	}

}
