package aswin;

import java.util.Scanner;

public class freq_char {

	public static void main(String[] args) {
		int length, i, flag=0;
		char letter=0;
		String word, reverse = "";
		System.out.println("Enter a Word");
		Scanner x=new Scanner (System.in);
		word=x.nextLine();
		length= word.length();
		System.out.println("Enter a letter");
		Scanner y=new Scanner (System.in);
		letter=y.next().charAt(letter);
		for (i=0; i<length; i++)
			{
				if(word.charAt(i)==letter)
					flag = flag+1;
					
			}
		System.out.println("frequency of "+letter+" = "+flag);
		// TODO Auto-generated method stub

	}

}
