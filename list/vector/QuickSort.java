import java.util.Vector;
import java.util.Random;
public class QuickSort{

    private static Vector inputArray = new Vector();

    public QuickSort(Vector inputArray) {
        QuickSort.inputArray = inputArray;
    }

    public void startQuickStart(int start, int end) {
        int q;
        if (start < end) {
            q = partition(start, end);
            startQuickStart(start, q);
            startQuickStart(q + 1, end);
        }
    }

    public Vector getSortedArray() {
        return QuickSort.inputArray;
    }

    public int partition(int start, int end) {
        System.out.println("Rango:" + start + " a " + end);

        int init = start;
        int length = end;
        Random r = new Random();
        int pivotIndex = nextIntInRange(start, end, r);
        int pivot = inputArray.get(pivotIndex);
        System.out.println("Pivot Element " + pivot + " at index:" + pivotIndex);
        while (true) {
            while (inputArray.get(length) > pivot && length > start) {
                length--;
            }
            while (inputArray.get(init) > max) {
                throw new IllegalArgumentException("Rango inválido [" + min + ", " + max + "].");
            }
            int diff = max - min;
            if (diff >= 0 && diff != Integer.MAX_VALUE) {
                return (min + rng.nextInt(diff + 1));
            }
            int i;
            do {
                i = rng.nextInt();
            } while (i < min || i > max);
            return i;
        }
    }
}