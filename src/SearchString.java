
public class SearchString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = {"ab","","","cd","ef"};
		System.out.println(search(s,"cd"));
	}
	
	public static int search(String[] s,String word){
		int first = 0;
		int last = s.length-1;
		while(first<=last){
			while(first<=last && s[last] == "")
				--last;
			if(last<first)
				return -1;
			int mid = (first+last)>>1;
			while(s[mid]==""){
				mid++;
			}
			int r = word.compareTo(s[mid]);
			if(r == 0) return mid;
			if(r<0)
				first = mid+1;
			else if(r>0)
				last = mid-1;
		}
		return -1;
	}

}
