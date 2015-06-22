import java.util.Random;


public class MergeSort {
	static int[] helper;
	static int[] numbers;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] values =20;
		//
		numbers = new int[7];
		Random generator = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = generator.nextInt(20);
		}
		helper = new int[numbers.length];
		
		mergeSort(0,numbers.length-1);
		for(int i:numbers){
			System.out.println(i);
		}
	}
	
	
	public static void mergeSort(int low, int high){
		if(low<high){
			int mid = (low + high)/2;
			mergeSort(low,mid);
			mergeSort(mid+1,high);
			merge(low,mid,high);
		}
	}
	
	public static void merge(int l,int m,int h){
		for(int i=l;i<=h;i++){
			helper[i] = numbers[i];
		}
		int i= l;
		int j = m+1;
		int k = l;
		while(i<=m && j<=h){
			if(helper[i] <=numbers[j]){
				numbers[k] =helper[i];
				i++;
			}else{
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		while(i<=m){
			numbers[k] = helper[i];
			i++;
			k++;
		}
		
	}

}
