package cosc1047.lab1;

import java.util.Scanner;

public class TimerTest {
    public static void main(String[] args) {
        Timer t1 = new Timer(1, 2, 3);
        Scanner s = new Scanner(System.in);
        System.out.println("In t1, from constructor, 1 2 3");
        System.out.println("Enter hours, minutes and seconds for t2");
        Timer t2 = new Timer(s.nextInt(), s.nextInt(), s.nextInt());
        System.out.println("Enter hours, minutes and seconds for t3");
        Timer t3 = new Timer(s.nextInt(), s.nextInt(), s.nextInt());
        Timer t4 = t1.addTime(t2).addTime(t3);
        System.out.printf("In t4, Hours: %d\nMinutes: %d\nSeconds: %d\n", t4.getHours(), t4.getMinutes(), t4.getSeconds());
    }
}
