package classandobject;
import java.util.*;

public class DatePrinter {
    public static void main(String[] a) {
        System.out.println(new Date().getTime() + "Now " + (new Date()).toString());
        System.out.println("1000 " + (new Date(10000)).toString());
        System.out.println("10000 " + (new Date(100000)).toString());
        System.out.println("1000000 " + (new Date(1000000)).toString());
        System.out.println("10000000 " + (new Date(100000000)).toString());
        System.out.println("100000000 " + (new Date(1000000000)).toString());
        System.out.println("1000000000 " + (new Date(10000000000l)).toString());
        System.out.println("10000000000 " + (new Date(100000000000l)).toString());

        GregorianCalendar c = new GregorianCalendar();
        System.out.println(c.get(GregorianCalendar.DAY_OF_WEEK));
    }
}
