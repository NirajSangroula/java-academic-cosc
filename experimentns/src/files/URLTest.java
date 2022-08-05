package files;

import java.net.URL;
import java.util.Scanner;

public class URLTest {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://nirajsangroula.github.io");
			Scanner sc = new Scanner(url.openStream());
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
