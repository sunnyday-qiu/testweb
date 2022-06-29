package com.sunnyday.util;

import java.util.Arrays;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2022/4/11
 */
public class SimpleDataSortUtils {

    /**
     * 冒泡排序
     */
    public static void natualSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // 1 + 2 + 3 + ... + (n - 1)
        // T(n) = O(n^2)
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 6, 7, 8, 9};
        natualSort(arr);
    }
}
