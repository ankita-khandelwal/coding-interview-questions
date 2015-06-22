
public class RotationString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isRotated("waterbottle","erbottlewate"));
	}
	
	public static boolean isRotated(String s1, String s2){
		String s3 = s1+s1;
		if(s1==null || s2==null)
			return false;
		if(s1.length()!=s2.length())
			return false;
		if(s3.contains(s2))
			return true;
		return false;
	}

}
