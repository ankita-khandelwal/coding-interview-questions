import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ArrayPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] origArray = {1,1,-4,6,7,-5};
		arrayPairs(origArray,2);
		int[] a = {2,5,5,5,6,8,9};
		arrayPairs(a,10);
	}

	public static void arrayPairs(int[] origArray, int sum){
		HashMap<Integer,Integer> countElements=new HashMap<Integer,Integer>();
		//countElements.containsKey(arg0)
		for(int num:origArray){
			int key = sum - num;
			if(countElements.containsKey(key)){
				for(int j=0;j<countElements.get(key);j++)
				System.out.println("The intgers are "+num+"and "+ key);
			}
				if(countElements.containsKey(num)){
					countElements.put(num, countElements.get(num)+1);
				}else{
					countElements.put(num, 1);
			}
		}
	}
	
	public static void arrayPairs1(int[] sortedArray, int sum){
		int first = 0;
		int last = sortedArray.length-1;
		while(first<last){
			int s = sortedArray[first]+sortedArray[last];
			if(s==sum){
				System.out.println("The intgers are "+sortedArray[first]+"and "+ sortedArray[last]);
				++first;
				--last;
			}else {
				if(s<sum){
				++first;
			} else{
				--last;
			}
			}
		}
	}
}
