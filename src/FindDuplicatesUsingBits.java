
public class FindDuplicatesUsingBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	public static void checkDuplicates(int[] array){
		BitSet bs = new BitSet(32000);
		for(int i=0;i<array.length;i++){
			int n = array[i];
			int pos = n -1;
			if(bs.get(pos))
				System.out.println(n);
			else
				bs.set(pos);
		}
	}

	static class BitSet{
		int[] bits ;
		public BitSet(int size){
			bits = new int[size>>>5];
		}
		boolean get(int pos){
			int wordNumber = pos >>>5;
			int posNumber = pos & 0x1F;
			return (bits[wordNumber] & (1<<posNumber))!=0;
		}
		void set(int pos){
			int wordNumber = pos >>>5;
			int posNumber = pos & 0x1F;
			bits[wordNumber]|=(1<<posNumber);
		}
	}
}
