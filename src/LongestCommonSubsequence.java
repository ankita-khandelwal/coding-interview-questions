
public class LongestCommonSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findCommon("abcrfghwetfwetxyabc","abrfghwwetxyabefghts");
	}
	
	public static void findCommon(String s1, String s2){
		int start = 0, end =1, max=0, maxx=0;
		int fStart =0;
		int fEnd = 0;
		while(end<s1.length()+1){
			if(s2.contains(s1.substring(start, end))){
				if(maxx < (end-start)){
					fStart = start;
					fEnd = end;
				}
				end++;
				max++;
			}else{
				if(max > maxx)
					maxx = max;
				max = 0;
				start++;
				end = start+1;
				continue;
			}
		}
		System.out.println(s1.substring(fStart, fEnd));
	}

}
