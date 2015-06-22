import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;


public class CovertingStringIntoAnother {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> dictionary = new HashSet<String>();
		dictionary.add("DAMP");
		dictionary.add("LAMP");
		dictionary.add("LIMP");
		dictionary.add("LIKP");
		dictionary.add("LIKE");
		List<String> list = convertString("DAMP", "LIKE", dictionary);
		for(String word: list){
			System.out.println(word);
		}
	}
	
	public static List<String> convertString(String s1, String s2, Set<String> dictionary){
		Map<String,String> backtrackMap = new HashMap<String, String>();
		Queue<String> actionQueue = new LinkedList<String>();
		Set<String> visitedSet = new HashSet<String>();
		if(s1.length()!=s2.length())
			return null;
		actionQueue.add(s1);
		visitedSet.add(s1);
		while(!actionQueue.isEmpty()){
			String w = actionQueue.poll();
			for(String v: getOneEditWords(w)){
				if(v.equalsIgnoreCase(s2)){
					List<String> list = new LinkedList<String>();
					list.add(v);
					while(w!=null){
						list.add(0,w);
						w=backtrackMap.get(w);
					}
					return list;
				}
				if(dictionary.contains(v))
					if(!visitedSet.contains(v)){
						actionQueue.add(v);
						visitedSet.add(v);
						backtrackMap.put(v, w);
					}
			}
		}
		
		return null;
	}

	private static Set<String> getOneEditWords(String w) {
		// TODO Auto-generated method stub
		Set<String> words = new TreeSet<String>();
		for(int i=0;i<w.length();i++){
			char[] c = w.toCharArray();
			for(char d='A';d<='Z';d++){
				if(d!=w.charAt(i)){
					c[i] =d;
					words.add(new String(c));
				}
			}
		}
		return words;
	}

}
