package assignment3.ex2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadScore {
	public static void main(String[] args) {
		try{
			URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
			Scanner sc = new Scanner(url.openStream());
			int n = 0, sum = 0;
			while(sc.hasNext()){
				sum += sc.nextInt();
				n++;
			}
			System.out.printf("Sum: %d, Average: %f\n", sum, (double)sum / n);
		}
		catch(MalformedURLException e){
			System.out.println("URL is invalid");
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}
