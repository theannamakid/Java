//Even or odd number
package aswin;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a Number");
		Scanner x=new Scanner(System.in);
		a=x.nextInt();
		if (a%2==0)
			System.out.println("It is EVEN Number");
		else
			System.out.println("It is a ODD Number");
		// TODO Auto-generated method stub

	}

}
