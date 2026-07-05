package Arrays;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] arr = {45, 12, 78, 4, 23};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}