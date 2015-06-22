import java.util.Arrays;


public class PythagorasTheorem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={3,4,6,5,10,9,8,13,12};
		int a,b,c;
		int len =arr.length;
		for(int i=0;i<len;i++){
			arr[i] *=arr[i];
		}
		Arrays.sort(arr);
		System.out.println(arr);
		
	}

}
