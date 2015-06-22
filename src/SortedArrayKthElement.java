
public class SortedArrayKthElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {9,14,16,17,20};
		int[] array2 = {6,8,10,11,34};
		int k=3;
		int value;
		int i=0;
		int j=0;
		while(k>=0){
		
				if(array1[i]<=array2[j]){
					k--;
					if(k==0){
						value = array1[i];
						System.out.println(value);
						return;
					}
					i++;
				}else{
					k--;
					if(k==0){
						value = array2[j];
						System.out.println(value);
						return;
					}
					j++;
				}
				if(i==0 && j==0){
					System.out.println("No kth element");
					return;
				}
			
		}
	}

}
