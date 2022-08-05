package files;

import java.io.*;

public class RandomAccessFileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (RandomAccessFile raf = new RandomAccessFile("texts/numbers.dat", "rw");) {
			while(true) {
				System.out.println(raf.readInt());
			}
		} 
		catch(EOFException e) {
			System.out.println("File read complete");
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
	}

}
