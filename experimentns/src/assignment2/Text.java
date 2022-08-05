package assignment2;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String text = s.nextLine();
		int vowels = 0, consonants = 0;
		int i = 0;
		while(i < text.length()) {
			if(Character.isLetter(text.charAt(i))) {
				switch(text.charAt(i)) {
					case 'a': case 'A': case 'e': case 'E': case 'i': case 'I': case 'o': case 'O': case 'u': case 'U':
						vowels++; break;
					default:
						consonants++;
				}
			}
			i++;
		}
		System.out.printf("%s has %d vowels and %d consonants", text, vowels, consonants);
		
	}

}
