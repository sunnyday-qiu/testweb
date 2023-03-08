package com.sunnyday.design.chain;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description: 大乐透蓝球号码（前5位数字）
 *
 * @author sunnyday
 * @date 2022/11/7
 */
public class BlueNumberHandler<T> implements NumberHandler<Integer> {

    final int SIZE = 5;

    final int MAX = 35;

    private int[] numbers;

    public BlueNumberHandler() {
    }

    public BlueNumberHandler(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int getSize() {
        return SIZE;
    }

    @Override
    public int[] getNumbers() {
        if (numbers == null || numbers.length < SIZE) {
            numbers = new int[MAX];
            for (int i = 1; i <= MAX; i++) {
                numbers[i - 1] = i;
            }
        }
        return numbers;
    }
}
