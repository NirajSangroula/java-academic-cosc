package cosc1047.lab3;

import java.io.*;
import java.util.*;

public class ReadFromFile {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Exercise17_05.dat"))){
        Integer[] arr = (Integer[])ois.readObject();
            for(int n : arr)
                System.out.println(n);
            System.out.println((Date)ois.readObject());
            System.out.println((Double)ois.readObject());
        }
        catch(FileNotFoundException f){
            System.out.println(f);
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
