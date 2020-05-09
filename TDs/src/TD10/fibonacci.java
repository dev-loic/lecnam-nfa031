package TD10;

public class fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacciIteratif(20));
		System.out.println(fibonacciRecursif(20));
	}
	
	static int fibonacciIteratif(int n) {
		int first=0, second=1, temp=0;
		for(int i=0;i<n;i++) {
			temp = first+second;
			first = second;
			second = temp;
		}
		return first;
	}
	
	static int fibonacciRecursif(int n) {
		if(n==0 || n==1) {
			return n;
		} else {
			return fibonacciRecursif(n-1)+fibonacciRecursif(n-2);
		}
	}
}
