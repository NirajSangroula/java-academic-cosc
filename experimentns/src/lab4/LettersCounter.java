package lab4;

import java.util.Scanner;

public class LettersCounter {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		System.out.println("No of letters is " + countLetters(string));
		s.close();

	}

	public static int countLetters(String string) {
		int count = 0;
		for(int i = 0; i < string.length(); i++){
			if(Character.isLetter(string.charAt(i)))
				count++;
		}
		
		return count;
	}

}
