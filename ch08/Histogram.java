import java.util.Random;

/**
 * Example code related to histograms.
 */
public class Histogram {

    /**
     * Returns an array of random integers.
     */
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    /**
     * Computes the number of array elements in [low, high).
     */
    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int numValues = 8;
        int[] array = randomArray(numValues);
        ArrayExamples.printArray(array);

        int[] scores = randomArray(30);
        int a = inRange(scores, 90, 100);
        int b = inRange(scores, 80, 90);
        int c = inRange(scores, 70, 80);
        int d = inRange(scores, 60, 70);
        int f = inRange(scores, 0, 60);

        // making a histogram
        int[] counts = new int[100];
        for(int i = 0; i < counts.length; i++) {
            count[i] = inRange(scores, i, i+1);
        }
        
        //more efficient loop that only traverses array once
        for (int i = 0; i < scores.length; i++) {
            int index = scores[i];
            counts[index]++;
        }
        
        //foreach
        //basic for loop
        for(int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }
        //written as for each
        for(int value : values) {
            System.out.println(value);
        }
        // histogram with enhanced for loop
        counts = new int[100];
        for (int score : scores) {
            counts[score]++;
        }
    }

}
