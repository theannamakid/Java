package aswin;

import java.util.Scanner;

public class largest_3_else_if {

	public static void main(String[] args) {
		int num_1, num_2, num_3;
		System.out.println("Enter 3 numbers");
		Scanner x=new Scanner(System.in), y=new Scanner(System.in), z=new Scanner(System.in);
		num_1=x.nextInt();
		num_2=y.nextInt();
		num_3=z.nextInt();
		if (num_1 > num_2 && num_1 > num_3)
			System.out.println(num_1+" is the Largest");
		else if (num_2 > num_1 && num_2 > num_3)
			System.out.println(num_2+" is the Largest");
		else
			System.out.println(num_3+" is the Largest");
		
		// TODO Auto-generated method stub

	}

}
