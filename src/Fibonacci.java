
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int fibn(int n){
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else if(n>1)
			return fibn(n-1)+fibn(n-2);
		else
			return -1;
	}
	
	public static int iterFibn(int n){
		if(n<0)
			return -1;
		else if(n == 0)
			return 0;
		int a=1,b=1;
		for(int i=3;i<n;i++){
			int c = a+b;
			a=b;
			b=c;
		}
		return b;
	}
}
