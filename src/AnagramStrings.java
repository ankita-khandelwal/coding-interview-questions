
public class AnagramStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(anagram1("ankitaa","atiknak"));
	}
	
	public boolean anagram(String s1,String s2){
		//return s1.sort() == s2.sort();
		return true;
	}
	
	public static boolean anagram1(String s1, String s2){
		if(s1.length()<0 || s2.length()<0)
			return false;
		if(s1.length()!=s2.length())
			return false;
		int[] strChars = new int[256];
		int numUniqueChars=0;
		for(char c: s1.toCharArray()){
			
			if(strChars[c] ==0) ++numUniqueChars;
			strChars[c]++;
		}
		int numCompleted=0;
		int i=0;
		for(char c: s2.toCharArray()){
			
			if(strChars[c]==0)
				return false;
			strChars[c]--;
			if(strChars[c]==0){
				++numCompleted;
				if(numCompleted == numUniqueChars)
					return i==s2.length()-1;
				
			}
			i++;
		}
		return true;
	}

}
