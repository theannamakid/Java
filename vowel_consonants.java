package aswin;

import java.util.Scanner;

public class vowel_consonants {

	public static void main(String[] args) {
		char letter=0;
		System.out.println("Enter a letter");
		Scanner x=new Scanner(System.in);
		letter=x.next().charAt(letter);
		if (letter =='a' || letter == 'A' || letter=='e' || letter=='E' || letter=='i' || letter=='I' || letter=='o' || letter=='O' || letter=='u' ||
letter=='U')
			System.out.println("It is a Vowel");
		else
			System.out.println("It is a Consonant");
		// TODO Auto-generated method stub

	}

}
