package week1.day2;

public class FibonacciInRange {

	public static void main(String[] args) {
		
		int range=50;
		int first=0,second=1;
		
		System.out.println("Fibonacci Range up to "+range);
		System.out.print(first+" "+second+" ");
		int next=first+second;
		while(range>=next) {
			System.out.print(next+" ");
			first=second;
			second=next;
			next=first+second;
		}
		

	}

}
