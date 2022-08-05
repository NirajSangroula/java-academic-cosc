package files;

import java.io.*;

public class DataInputFilterClasses {

	public static void main(String[] args) {
		try(DataOutputStream dis = new DataOutputStream(new FileOutputStream("texts/priyashi.dat"))){
			dis.writeUTF("Priyashi kaa yaad haru");
			dis.writeUTF("Koriyeako mutu");
			dis.writeUTF("Koriyeako mutu");
			dis.writeBytes("Malai maaf garideu pani dami song hota *°▽°*)╯╰(*°▽°*) hai");
			dis.writeBytes("Arko ni geet xa hai, chars.. Unicode jastai renta╰(*°▽°*)╯╰(*°▽°*)╯)");
			dis.writeBoolean(true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try(DataInputStream dis = new DataInputStream(new FileInputStream("texts/priyashi.dat"))){
			do {
				System.out.print((char)dis.read());
			}
			while(true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (EOFException e) {
			System.out.println("File end");
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}

}
