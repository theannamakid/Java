package aswin;

import java.util.Scanner;

public class Swap_2 {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter 2 Numbers");
		Scanner x = new Scanner (System.in), y = new Scanner (System.in);
		a=x.nextInt(); b=y.nextInt();
		System.out.println("Value of a & b Before Swapping\n"+"a="+a+" b="+b);
		a=a+b; b=a-b; a=a-b;
		System.out.println("Value of a & b After Swapping\n"+"a="+a+" b="+b);
		
		// TODO Auto-generated method stub

	}

}
