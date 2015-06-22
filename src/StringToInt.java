
public class StringToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(stringToInt("-34d6sd"));
	}
	
	public static int stringToInt(String string){
		int len = string.length();
		int num=0;
		boolean isNeg = false;
		
		for(int i=0;i<len;i++){
			if((string.charAt(i)>='0' && string.charAt(i)<='9') || string.charAt(i)=='-'){
			if(string.charAt(i) == '-'){
				isNeg = true;
				
				continue;
			}
			num*=10;
			num+=string.charAt(i) - '0';	
			}
			
		}
		if(isNeg){
			num*=-1;
		}
		return num;
	}

}
