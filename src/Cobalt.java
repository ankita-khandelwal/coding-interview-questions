import java.util.ArrayList;


public class Cobalt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abc";
		int len = input.length();
		StringBuffer reverseString = new StringBuffer();
		for (int i = len - 1; i>=0; i--) {
		 	reverseString.append(input.charAt(i));
		}
		if(reverseString.toString().equals(input))
			System.out.println(true);
		else
			System.out.println(false);
	}

}
