
public class ShortestDistanceWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int shortestDist(String[] strings,String word1,String word2){
		int pos = 0;
		int min = Integer.MAX_VALUE/2;
		int word1_pos = -min;
		int word2_pos = -min;
		for(int i=0;i<strings.length;i++){
			if(strings[i] == word1){
				word1_pos = pos;
				int dist = word1_pos - word2_pos;
				if(min > dist){
					min = dist;
				}
			}else if(strings[i] == word2){
				word2_pos = pos;
				int dist = word2_pos - word1_pos;
				if(min > dist){
					min = dist;
				}
			}
			++pos;
			
		}
		return min;
	}

}
