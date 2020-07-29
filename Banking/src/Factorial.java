import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int b = s.nextInt();
		int result = fact(b);
		System.out.println("factorial of a number is "+result);

	} 

	public static int fact(int n) {
		int i,fact=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;

		}

		return fact;
	}

}
