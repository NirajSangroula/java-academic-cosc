package cosc1047.lab2;
import java.util.*;

public class City {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(new String[]{"Toronto", "Brampton", "Missisauga", "Hamilton", "Kingston"}));

        int indexOfBrampton = cities.indexOf("Brampton");
        int indexOfKingston = cities.indexOf("Kingston");

        System.out.printf("Index of\nBrampton : %d\nKingston : %d\n", indexOfBrampton, indexOfKingston);
        cities.add("Ottawa");
        cities.add(indexOfBrampton + 1, "Berry");
        System.out.println("\nToronto is" + (cities.contains("Toronto")?" ": " not ") + "in the list\n");

        if(cities.remove("Hamilton"))
            System.out.println("Hamilton is removed");
        if(cities.remove("Kingston"))
            System.out.println("Kingston is removed");

        System.out.println(cities.remove(2) + " is removed");

        System.out.println("\nCities currently in the list");
        for(String city: cities){
            System.out.println(city);
        }

        java.util.Collections.sort(cities);
        System.out.println("\nAfter sorting, cities in the list");

        for(String city: cities){
            System.out.println(city);
        }
    }
}

