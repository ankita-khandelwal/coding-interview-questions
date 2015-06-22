
public class PermuteString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permute("the");
	}

	static int permute(String string){
		int[] used ;
		char[] perString;
		if(string == null){
			return -1;
		}
		if(string.isEmpty()){
			return -1;
		}
		int len = string.length();
		perString = new char[len];
		used = new int[len];
		for(int i:used){
			i = 0;
		}
		doPermute(string, perString,used,len,0);
		return 1;
	}

	private static void doPermute(String string, char[] perString, int[] used,
			int len, int recursiveLen) {
		// TODO Auto-generated method stub
		int i;
		if(recursiveLen == len){
			System.out.println(new String(perString));
		}
		for(i=0;i<len;i++){
			if(used[i]==1)
				continue;
			perString[recursiveLen] = string.charAt(i);
			used[i]=1;
			doPermute(string, perString, used, len, recursiveLen+1);
			used[i]=0;
		}
	}
}
