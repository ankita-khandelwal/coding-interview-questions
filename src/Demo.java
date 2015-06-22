
public class Demo {
public static void main(String args[]){
	System.out.println(add(122,132));
	removeDuplicates("Hello");
	int[] arr={2,-3,-8,3,5,-1,7,-10};
	System.out.println(maxSum(arr));
}
public static int add(int a, int b){
	if (b==0) return a;
	int sum = a^b;
	int carry = (a&b)<<1;
	
	return add(sum,carry);
}
public static void removeDuplicates(String word){
	if(word==null)
		return;
	int len = word.length();
	if(len<2)
		return;
	int tail = 1;
	char[] str=word.toCharArray();
	for(int i=1;i<len;++i){
		int j;
		for(j=0;j<tail;++j){
			if(str[i]==str[j])
				break;
		}
		if(j==tail){
			str[tail]=str[i];
			++tail;
		}
	}
	str[tail] =0;
	StringBuffer wrd=new StringBuffer();
	
	for(int i=0;i<str.length;i++){
		wrd.append(str[i]);
		}
	System.out.println(wrd.toString());
}
public static int maxSum(int[] arr){
	int sum=0;
	int maxsum=0;
	for(int i=0; i<arr.length;i++){
		sum+=arr[i];
		if(maxsum<sum){
			maxsum=sum;
		}else
			sum=0;
		if(sum<0){
			sum=0;
			
		}
	}
	return maxsum;
}
}
