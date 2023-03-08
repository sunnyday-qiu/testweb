package com.sunnyday.algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/15
 */
public class Algorithm {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 1000);
        }
        System.out.println(Arrays.toString(arr));

//        System.out.println(Arrays.toString(sort1(arr)));

        System.out.println(Arrays.toString(sort2(arr)));

    }

    // 1.
    public static int[] sort1(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        int temp = arr[0];
        for (int i = arr.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                int current = arr[j];
                int next = arr[j + 1];
                if (current > next) {
                    temp = current;
                    arr[j] = next;
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    //2.
    public static int[] sort2(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        for (int j = 0; j < arr.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            if (min != j) {
                int tem = arr[j];
                arr[j] = arr[min];
                arr[min] = tem;
            }
        }
        return arr;
    }

    // 3.
    public static int[] sort3(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }


        return arr;
    }

}