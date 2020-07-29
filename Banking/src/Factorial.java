import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int s = sc.nextInt();
		int result = fact(s);
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
