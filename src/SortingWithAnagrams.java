
public class SortingWithAnagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,3,5,6,7,8,9};
		System.out.println(findElement(a,8));
	}
	
	public static int compareTo(String that){
		/*String s1 = this.sort();
		String s2 = that.sort();
		return s1.compareTo(s2);*/
		return 0;
	}
	
	public static int findElement(int[] a,int x){
		int l = 0;
		int m = a.length-1;
		while(l<=m){
			int mid = (l+m)/2;
			if(a[mid] == x){
				return mid;
			}else if(a[l]<=a[m]){
				if(x>a[mid]){
					l = mid+1;
				}else if(x>a[l]){
					m = mid-1;
				}else{
					l = mid+1;
				}
			}else if(x<a[mid]){
				m = mid-1;
			}else if(x<=a[m]){
				l=mid+1;
			}else
				m=mid-1;
		}
		return -1;
	}

}
