package ape;

import java.io.*;
import java.math.*;
import java.util.*;

public class RAMClass {

	public static void main(String[] args) {
		try (RandomAccessFile file = new RandomAccessFile("text/arraylist.txt", "rw")){
			System.out.println(file.readLine()); //Niraj*Nitesh*Kabita
			file.seek(4);
			file.writeChars("j");
			file.seek(5);
			
			System.out.println(file.readLine()); //Niraj*Nitesh*Kabita
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
