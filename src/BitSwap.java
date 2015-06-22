
public class BitSwap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BitSwapReqd(2,4));
		System.out.println(swapOddEvenBits(2));
	}
	
	public static int BitSwapReqd(int a,int b){
		int number = a^b;
		int x=0;
		while(number!=0){
		x=x+(number&1);
		number=number>>1;
		}
		return x;
	}
	public static long swapOddEvenBits(long b){
		return(((b&0xaaaaaaaa)>>1 )|((b&0x55555555)<<1));
	}

}
