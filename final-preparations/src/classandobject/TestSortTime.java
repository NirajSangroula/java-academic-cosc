package classandobject;
public class TestSortTime{
    public static void main(String[] args) {
        Stopwatch s = new Stopwatch();
        s.start();
        sortedIndex(getRandomArray(10000));
        s.stop();
        System.out.println("Elapsed time is : " + s.getElapsedTime());

        s.start();
        sortedIndex(getRandomArray(100000));
        s.stop();
        System.out.println("Elapsed time is : " + s.getElapsedTime());
        {};

    }

    public static int[] getRandomArray(int size){
        int[] a = new int[size];
        for(int i = 0; i < size; i++)
            a[i] = (int)(Math.random() * 10000);
        return a;
    };
    
    public static int[] sortedIndex(int[] values) {
        int [] sortedIndex = new int[values.length];
        //Initialize sortedIndex 0 to n
        for(int i = 0; i < values.length; i++){
            sortedIndex[i] = i;
        }
        //Sort the index 0 to n in the same way, values will be sorted
        for(int i = 0; i < values.length; i++){
            int gIndex = -1;
            int g = values[i];
            for(int j = i + 1; j < values.length; j++){
                if(g < values[j]){
                    g = values[j];
                    gIndex = j;
                }
            }
            if(gIndex != -1){
                int temp = values[i];
                values[i] = values[gIndex];
                values[gIndex] = temp;
                
                int t = sortedIndex[i];
                sortedIndex[i] = sortedIndex[gIndex];
                sortedIndex[gIndex] = t;
            }
        }
        return sortedIndex;
    }
};