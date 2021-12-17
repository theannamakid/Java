package aswin;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int length, i;
		String word, reverse = "";
		System.out.println("Enter a Word or Number");
		Scanner x=new Scanner (System.in);
		word=x.nextLine();
		length= word.length();
		for (i=length-1; i>=0; i--)
			reverse = reverse + word.charAt(i);
		if(word.equals(reverse))
			System.out.println("it is a Palindrome");
		else
			System.out.println("it is not a Palindrome");
		//System.out.println(reverse);
		// TODO Auto-generated method stub

	}

}

