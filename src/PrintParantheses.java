
public class PrintParantheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printParan(4,4,new StringBuffer(),0);
	}
	
	public static void printParan(int l,int r, StringBuffer string,int count){
		
		if(l<0 || r<l)
			return;
		if(l==0 && r==0)
			System.out.println(string.toString());
		else{
			if(l>0){
				string.append("{");
				printParan(l-1,r,string,count+1);
			}
			if(r>l){
				string.append("}");
				printParan(l,r-1,string,count+1);
			}
		}
	}

}
