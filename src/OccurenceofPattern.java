
public class OccurenceofPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findIthOccurence("abcabcefgabc", "abc", 3));
	}
	
	public static int findIthOccurence(String s, String p,int j){
		int count = 0;
		int len = p.length();
		for(int i=0; i<s.length();i++){
			if(len+i <= s.length()){
			if(s.substring(i, len+i).equalsIgnoreCase(p)){
				count++;
				if(count == j)
					return i+1;
			}
			}
			
		}
		return -1;
	}

}
