import java.util.Scanner;

public class Inpu {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < 10; i++)
            arg[i] = s.next();
        for(String p : arg){
            System.out.println(p + "\t");
        }
    }
}
