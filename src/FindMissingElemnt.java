

public class FindMissingElemnt {
	public static final int INTEGER_SIZE =10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitIntegers[] bitArray = new BitIntegers[3];
		bitArray[0] = new BitIntegers(0);
		bitArray[1] = new BitIntegers(1);
		bitArray[2] = new BitIntegers(3);
		BitIntegers missingInt = findMissing(bitArray);
		System.out.println(missingInt.toInt());
	}
	public static BitIntegers findMissing(BitIntegers[] bitArray){
		bitArray = preprocessArray(bitArray);
		BitIntegers missing = new BitIntegers(INTEGER_SIZE);
		for(int j=0;j<INTEGER_SIZE;j++){
			missing.set(j, 0);
		}
		for(int i=0;i<bitArray.length;i++){
			for(int j=0;j<INTEGER_SIZE;j++){
				int newBit = (missing.fetch(j)+bitArray[i].fetch(j))&1;
				missing.set(j, newBit);
			}
		}
		return missing;
	}
	public static BitIntegers[] preprocessArray(BitIntegers[] bitArray){
		int k=0;
		int N=bitArray.length;
		while(N>0){
			k++;
			N=N>>1;
		}
		N=1;
		for(int i=1;i<k;i++){
			N=(N<<1)+1;
		}
		
		BitIntegers[] integers = new BitIntegers[N];
		for(int j=0;j<bitArray.length;j++){
			integers[j] = new BitIntegers();
			for(int bitIndex=0;bitIndex<INTEGER_SIZE;bitIndex++){
				int bit = bitArray[j].fetch(bitIndex);
				integers[j].set(bitIndex,bit);
			}
		}
		for(int j=bitArray.length;j<N;j++){
			integers[j] =new BitIntegers(j+1);
		}
		return integers;
	}
	public static class BitIntegers{
		private boolean[] bits;
		public BitIntegers(){
			bits = new boolean[INTEGER_SIZE];
		}
		public BitIntegers(int value){
			bits = new boolean[INTEGER_SIZE];
			for(int j=0;j<INTEGER_SIZE;j++){
				if(((value>>j)&1)==1)bits[j]=true;
				else bits[j]=false;
			}
		}
		public int fetch(int k){
			if(bits[k])return 1;
			else return 0;
		}
		public void set(int index,int bit){
			if(bit == 0) bits[index] =false;
			else bits[index] = true;
		}
		public int toInt(){
			int number=0;
			for(int j=INTEGER_SIZE-1;j>=0;j--){
				number = number|fetch(j);
				if(j>0)
					number = number<<1;
			}
		
		return number;
		}
	}

}
