//program to find area of square, circle and triangle using method_overloading
package test;

import java.util.Scanner;

public class method_overloading {
	class find_area
	{
		static int area(int x)
		{
			System.out.println("Area of square = "+x*x);
			return x*x;
		}
		static float area(float y)
		{
			float z=(y*y);
			System.out.println("Area of circle = "+3.14*z);
			return z;
		}
		static float  area(float x,float y)
		{
			System.out.println("Area of triangle = "+.5*x*y);
			return x*y;
		}
	}

	public static void main(String[] args) {
		char i='y';
		while(i=='y' || i=='Y')
		{
			System.out.println(" Select a Shape\n square = 1\n circle = 2\n triangle = 3\n");
			Scanner b=new Scanner(System.in);
			int c=b.nextInt();
			Scanner d=new Scanner(System.in);
			if (c==1)
			{
				System.out.println("Enter length of side : ");
				int x=d.nextInt();
				find_area.area(x);
			}
			else if(c==2)
			{
				System.out.println("Enter radius of circle : ");
				float y=d.nextFloat();
				find_area.area(y);
			}
			else if(c==3)
			{
				System.out.println("Enter Base of Tiangle : ");
				float x=d.nextFloat();
				System.out.println("Enter Height of Triangle : ");
				float y=d.nextFloat();
				find_area.area(x,y);
			}
			else
				System.out.println("Enter a Valid input\n");
			System.out.println("Do you want to continue Y/N : ");
			i=d.next().charAt(0);
		}
		if (i=='n' || i=='N')
		{
			System.out.println("Thankyou");
		}
		// TODO Auto-generated method stub

	}

}
