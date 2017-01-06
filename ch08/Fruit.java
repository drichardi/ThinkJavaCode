/**
 * Fruit exercise.
 * The purpose of this exercise is to practice reading code and recognizing
 * the traversal patterns we have learned so far.  The following methods
 * are hard to read, because instead of using meaningul names for the variables
 * and methods, they use the names of fruit.
 *
 * For each method, write one sentence that describes what the method does, without
 * getting into the details of how it works.
 *
 * For each variable, identify the role it plays.
 */
public class Fruit {

    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }

}
