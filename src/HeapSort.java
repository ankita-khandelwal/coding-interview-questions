
public class HeapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void heapSort(int[] arr, int arr_uBound){
		int i,o;
		int lChild, rChild, mChild=0,root,temp;
		root = (arr_uBound -1)/2;
		for(o=root;o>=0;o--){
			for(i=root;i>=0;i--){
				lChild = 2*i+1;
				rChild = 2*i+2;
				if((lChild<=arr_uBound) && (rChild <=arr_uBound)){
					if(arr[lChild] < arr[rChild]){
						mChild = rChild;
					}else
						mChild = lChild;
				}else if(rChild > arr_uBound){
					mChild = lChild;
				}else
					mChild = rChild;
			}
			if(arr[i]<arr[mChild]){
				temp = arr[i];
				  arr[i] = arr[mChild];
				  arr[mChild] = temp;
			}
		}
		temp = arr[0];
		  arr[0] = arr[arr_uBound];
		  arr[arr_uBound] = temp;
		  return;
	}

}
