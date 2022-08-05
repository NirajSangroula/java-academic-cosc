package lab4;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students");
        int n = sc.nextInt();
        String[] names = new String[n];
        double[] scores = new double[n];
        System.out.println("Enter Name and Score of students: ");
        for(int i = 0; i < n; i++){
            System.out.println("Student " + (i + 1));
            names[i] = sc.next();
            scores[i] = sc.nextDouble();
        }
        String[] sortedNames = new String[n];
        double[] sortedScores = new double[n];
        int[] sortedIndex = sortedIndex(scores.clone());
        for(int i = 0; i < n; i++){
            sortedNames[i] = names[sortedIndex[i]];
            sortedScores[i] = scores[sortedIndex[i]];
        }

        names = sortedNames;
        scores = sortedScores;
        System.out.println("Results in order of score");
        for(int i = 0; i < n; i++){
            System.out.printf("%d. %-15s %3.2f\n", i + 1, names[i], scores[i]);
        }
        sc.close();
    }

    public static int[] sortedIndex(double[] values) {
        int [] sortedIndex = new int[values.length];
        //Initialize sortedIndex 0 to n
        for(int i = 0; i < values.length; i++){
            sortedIndex[i] = i;
        }
        //Sort the index 0 to n in the same way, values will be sorted
        for(int i = 0; i < values.length; i++){
            int gIndex = -1;
            double g = values[i];
            for(int j = i + 1; j < values.length; j++){
                if(g < values[j]){
                    g = values[j];
                    gIndex = j;
                }
            }
            if(gIndex != -1){
                double temp = values[i];
                values[i] = values[gIndex];
                values[gIndex] = temp;
                
                int t = sortedIndex[i];
                sortedIndex[i] = sortedIndex[gIndex];
                sortedIndex[gIndex] = t;
            }
        }
        return sortedIndex;
    }
}
