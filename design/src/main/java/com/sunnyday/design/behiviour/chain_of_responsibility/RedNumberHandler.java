package com.sunnyday.design.behiviour.chain_of_responsibility;


/**
 * Description: 大乐透红球号码（后2位数字）
 *
 * @author sunnyday
 * @date 2022/11/7
 */
public class RedNumberHandler<T> implements NumberHandler<Integer> {

    final int SIZE = 2;

    final int MAX = 12;

    private int[] numbers;

    public RedNumberHandler() {
    }

    public RedNumberHandler(int[] numbers) {
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
