
public class MergeBIntoA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,5,6 };
 		int[] b = {3,4};
		a=merge(a,b);
		for(int s:a){
			System.out.println(s);
		}
	}
	
	public static int[] merge(int[] a, int[] b){
		 int i = a.length-1;
		 int j = b.length-1;
		 int k = a.length+b.length-1;
		 while(i!=0 && j!=0){
			 if(a[i] > b[j]){
				 a[k--] = a[i--];
			 }else
				 a[k--] = b[j--];
		 }
		 while (j>=0){
			 a[k--] = b[j--];
		 }
		 return a;
	}

}
