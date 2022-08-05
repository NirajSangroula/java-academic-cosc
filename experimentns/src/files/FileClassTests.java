package files;
import java.io.*;
public class FileClassTests {

	public static void main(String[] args) {
		File picture = new File("resources/hi.png");
		System.out.println(picture.getAbsolutePath());

		System.out.println(picture.exists());
		
		File dir = new File("texts");
		if(!dir.isDirectory())
			dir.mkdir();
		
		File testFile = new File("texts/Akash.txt");
		try (PrintWriter pw = new PrintWriter(testFile)){
			pw.print("eotn eash Whatever");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
