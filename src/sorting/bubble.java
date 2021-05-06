package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bubble {
    public static void main(String args[]) throws Exception {

//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int m = sc.nextInt();
//            int[] array = new int[m];
//            for (int i = 0; i < m; i++) {
//                array[i] = sc.nextInt();
//            }
//            System.out.println("数组为:" + Arrays.toString(array));
//
//            //sort(array);
//
//            System.out.println("排序之后");
//            System.out.println("数组为:" + Arrays.toString(array));
//        }
        Scanner sc=new Scanner(System.in);
        String[] nums=null;
    System.out.println("请输入一组整数，以空格分隔：");
    nums=sc.nextLine().split(" ");
    int num[]=new int[nums.length];
    int sum=0;
    for(int i=0;i<num.length-1;i++){
        num[i]=Integer.valueOf(nums[i]);
        //sum+=num[i];

    }

        sort(num);
        System.out.println(num);

        System.out.println("结束");
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, i, j);
                }
            }
        }
    }
}
