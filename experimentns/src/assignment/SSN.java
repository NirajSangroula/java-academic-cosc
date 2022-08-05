package assignment;

import java.util.Scanner;

public class SSN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a SSN: DDD-DD-DDDD");
		String ssn = scanner.nextLine();
		boolean isValid = true;
		if(ssn.length() != 11) {
			isValid = false;
		}
		else if(!(ssn.charAt(3) == '-' && ssn.charAt(6) == '-'))
			isValid = false;
		else
			for(int i = 0; i < ssn.length(); i++) {
				if(!(i == 3 || i == 6))
					if(!(ssn.charAt(i) >= '0' && ssn.charAt(i) <= '9')) {
						isValid = false;
						break;
					}
			}
		System.out.printf("Your SSN %s %s.", ssn, (isValid ? "is valid" : "is invalid"));
		scanner.close();
			
	}

}
