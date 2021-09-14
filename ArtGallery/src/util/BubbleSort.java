package util;

/**
 *
 * @author Andresforero
 */
public class BubbleSort {
    public static Object[] bubble_srt(Object[] array) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i].hashCode() > array[k].hashCode()) {
                    swapNumbers(i, k, array);
                }
            }   
        }
        return array;
    }
    
    private static void swapNumbers(int i, int j, Object[] array) {
        Object temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    private static String printNumbers(Object[] input) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            string.append(input[i]).append("\n");
        }
        return string.toString();
    }
}
