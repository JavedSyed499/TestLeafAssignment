package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int a=23;
		boolean isnotprime = false;
		
		for(int b=2;a>b;b++) {
			if(a%b==0) {
				isnotprime = true;
				break;
			}
		}
		
		if(isnotprime) 
			System.out.println(a+" is not a prime number");
		else
			System.out.println(a+" is a prime number");

	}

}
