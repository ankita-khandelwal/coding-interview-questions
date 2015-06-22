
public class SubstringSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subString(20,3,1,3));
	}
	public static int subString(int n, int m, int i, int j){
		int max = ~0;
		int left = max - ((1<<j)-1);
		int right = (1<<i)-1;
		int mask = left|right;
		return (n&mask)|(m<<i);
	}

}
