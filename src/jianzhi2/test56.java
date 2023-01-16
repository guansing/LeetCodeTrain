package jianzhi2;

import java.util.Arrays;
import java.util.HashMap;

public class test56 {
    public int peakIndexInMountainArray(int[] arr) {
        HashMap<Integer, Integer> place = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            place.put(arr[i], i);
        }
        Arrays.sort(arr);
        int len = arr.length;
        return place.get(arr[len-1]);
    }

    public static void main(String[] args) {


    }
}
