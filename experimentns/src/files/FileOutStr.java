package files;
import java.io.*;
public class FileOutStr {

	public static void main(String[] args) {
		try(FileOutputStream os = new FileOutputStream(new File("texts/data.dat"))){
			String s = "Malai nasodha kaha dukchha ghaau";
			for(char c : s.toCharArray()) {
				os.write(c);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e1) {
			System.out.println(e1);
		}

	}

}
