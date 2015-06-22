
public class SwapNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapNumbers(10,20);
	}
	
	public static void swapNumbers(int a , int b){
		if(a!=b){
			a=a^b;
			b = a^b;
			a = a^b;
		}
		System.out.println("a= "+a+" and b= "+b);
	}

}
