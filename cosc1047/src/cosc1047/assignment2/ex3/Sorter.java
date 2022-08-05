package cosc1047.assignment2.ex3;
import java.util.*;

public class Sorter {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter five numbers:");
        Scanner s = new Scanner(System.in);
        for(int i = 1; i <= 5; i++)
            al.add(s.nextInt());
        sort(al);
        System.out.println("Numbers in increasing order");
        for(int i = 0; i < 5; i++)
            System.out.println(al.get(i));
    }

    public static void sort(ArrayList<Integer> al) {
        for(int i = 0; i < al.size() - 1; i++){
            for(int j = i; j < al.size(); j++){
                if(al.get(i) > al.get(j)){
                    int t = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, t);
                }
            }
        }
    }
}
