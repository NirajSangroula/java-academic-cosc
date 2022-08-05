package cosc1047.lab3;
import java.util.*;
import java.io.*;

public class StoreInFile {
    public static void main(String[] args) {
        try(
        		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"))
        ){
            oos.writeObject(new Integer[]{1, 2, 3, 4, 5, 6});
            oos.writeObject(new Date());
            oos.writeObject(10.5);
            System.out.println("Writing complete");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
