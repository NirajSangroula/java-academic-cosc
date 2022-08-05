package files;
import java.io.*;
public class InputStreamTest {

	public static void main(String[] args) {
		try(FileInputStream is = new FileInputStream(new File("texts/data.dat"))){
			int b;
			while((b  = is.read())!= -1) {
				System.out.print((char)b);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
