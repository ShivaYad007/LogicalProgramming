package factorial;

import java.util.Scanner;

public class Fact1 {

	public void fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Factorial of given number is: " + fact);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		Fact1 f = new Fact1();
		f.fact(sc.nextInt());

	}

}
