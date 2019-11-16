import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        System.out.println("Enter length of the array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Default array");
        System.out.println(Arrays.toString(array));

        for (int left = 0; left < array.length; left++) {
            // "catching" one element
            int value = array[left];
            // checking all elements before value
            int i = left - 1;
            for (; i >= 0; i--) {
                // if value less than element then move element to the right side
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // if element less than value then stop
                    break;
                }
            }
            //  fill value to the free pos
            array[i + 1] = value;
        }
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array));
    }
}

