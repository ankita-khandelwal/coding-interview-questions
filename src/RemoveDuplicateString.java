
public class RemoveDuplicateString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDup("Shweta Nanajkar");
	}
	
	public static void removeDups(String origString){
		if(origString == null)
			return;
		if(origString.length()<2){
			System.out.println(origString);
			return;
		}
		int tail=1;
		char[] origChar = origString.toCharArray();
		for(int j=1;j<origChar.length;j++){
			int k;
			for(k=0;k<j;k++){
				if(origChar[j] == origChar[k])
					break;
				
			}
			if(k==j){
				origChar[tail] = origChar[j];
				tail++;
			}
		}
		System.out.println(new String(origChar).substring(0, tail));
	}
	
	public static void removeDup(String origString){
		if(origString==null)
			return;
		if(origString.length()<2){
			System.out.println(origString);
			return;
		}
		char[] origChar = origString.toCharArray();
		boolean[] removeArray = new boolean[256];
		int i=0;
		for(int j=0;j<256;j++){
			removeArray[j] = false;
		}
		for(char c : origChar){
			if(removeArray[c] == false){
				removeArray[c] = true;
				origChar[i] = c;
				i++;
			}
		}
		System.out.println(new String(origChar).substring(0, i));
	}

}
