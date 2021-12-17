package aswin;
import java.util.Scanner;
public class swap_1 {
	public static void main(String[] args) {
		int a,b,c=0;
		
		System.out.println("Enter 2 Numbers");
		Scanner x = new Scanner (System.in);
		Scanner y = new Scanner (System.in);
		a=x.nextInt();
		b=y.nextInt();
		
		System.out.println("value of a & b Before swapping\n"+"a="+a+" b="+b);
		
		c=a; a=b; b=c;
		
		System.out.println("Value of a & b After Swapping\n"+"a="+a+" b="+b);
		
		// TODO Auto-generated method stub

	}

}
