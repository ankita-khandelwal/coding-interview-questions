
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {13,18,19,23,25};
		System.out.println(binarySearch(array, 0, array.length+1, 23));
	}
	
	static int binarySearch(int[] array, int l,int u,int target){
		int mid;
		while(l<u){
			mid = (l+u)/2;
			if(array[mid] == target)
				return mid;
			else if(target>array[mid])
				l=mid+1;
			else
				u = mid-1;
		}
		return -1;
	}

}
