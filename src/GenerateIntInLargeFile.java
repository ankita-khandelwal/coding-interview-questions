import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class GenerateIntInLargeFile {

	static byte[] bitField = new byte[0xFFFFFFFF/8];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(new FileReader("hello.txt"));
			while(in.hasNext()){
				int n = in.nextInt();
				bitField[n/8]|=1<<(n%8);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int missingInt(){
		int missing=0;
		int k=0;
		for(byte b : bitField){
			for(int i=0;i<8;i++){
				if((b&(1<<i))==0){
					missing = k*8+i;
				}
			}
			k++;
		}
		return missing;
	}

}
