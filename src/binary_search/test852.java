package binary_search;

public class test852 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("the value of mid is: " + mid);
            if(arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid+1]) {
                return mid;
            }

            else if(arr[mid] < arr[mid-1]) {
                right = mid;
            }

            else if(arr[mid] < arr[mid+1]) {
                left = mid;
            }
        }
        return -1;
    }
}
