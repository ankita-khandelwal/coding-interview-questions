import java.util.Random;


public class QuickSort {

	static int[] numbers;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers = new int[7];
		Random generator = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = generator.nextInt(20);
		}
		quickSort(0,numbers.length-1);
		for(int i:numbers){
			System.out.println(i);
		}
	}

	public static void quickSort(int low, int high){
		int i=low;
		int j =high;
		int pivot = numbers[(low+high)/2];
		while(i<=j){
			while(numbers[i]<pivot){
				i++;
			}
			
			while(numbers[j]>pivot){
				j--;
			}
			
			if(i<=j){
				exchange(i,j);
				i++;
				j--;
			}
		}
		if(low<j){
			quickSort(low,j);
		}
		if(i<high)
			quickSort(i,high);
	}
	
	private static void exchange(int i, int j){
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}
