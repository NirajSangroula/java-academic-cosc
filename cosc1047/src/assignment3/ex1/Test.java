package assignment3.ex1;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter a number 1-12");
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            if(n < 1 || n > 12)
                throw new ArrayIndexOutOfBoundsException();
            System.out.printf("Month: %s, Date of month: %d.", months[n - 1], dom[n - 1]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong number");
        }
    }
}
