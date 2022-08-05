package assignment;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		System.out.println("Enter a letter:");
		Scanner scanner = new Scanner(System.in);
		char letter = scanner.nextLine().charAt(0);
		System.out.print("You entered ");
		if(letter >= 'a' && letter <='z' || letter >= 'A' && letter <= 'Z')
			switch(letter) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("a Vowel."); break;
			default: System.out.println("a Consonant.");
			}
		else
			System.out.println("an Invalid input");
		scanner.close();
	}

}
