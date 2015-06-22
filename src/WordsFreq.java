import java.util.HashMap;


public class WordsFreq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] book = {"hello","hello","world","hi","everyone","hi","hi"};
		HashMap<String,Integer> words=freqWords(book);
		int count = getFreq(words,"hi");
		System.out.println(count);
	}
	
	public static HashMap<String,Integer> freqWords(String[] book){
		HashMap<String,Integer> words = new HashMap<String,Integer>();
		for(String word: book){
			if(words.containsKey(word)){
				words.put(word, words.get(word)+1);
			}else{
				words.put(word, 1);
			}
		}
		return words;
	}
	public static Integer getFreq(HashMap<String,Integer> words, String word){
		if(words == null || word == null)
			return -1;
		if(words.containsKey(word))
			return Integer.parseInt(words.get(word).toString());
		else return 0;
	}

}
