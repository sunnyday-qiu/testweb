package com.sunnyday.design.chain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Description: 数字生成器
 *
 * @author sunnyday
 * @date 2021/12/28
 */
public interface NumberHandler<T> {

    Random random = new Random();

    default String toStr(int number) {
        return number < 10 ? "0" + number : String.valueOf(number);
    }

    int getSize();

    int[] getNumbers();

    default void handle() {
        int[] numbers = getNumbers();

        int size = getSize();
        if (numbers.length <= size) {
            System.out.println(Arrays.stream(numbers)
                    .sorted()
                    .mapToObj(this::toStr)
                    .collect(Collectors.joining(" ,")));
        } else {
            List<Integer> res = new ArrayList<>(size);
            do {
                int index = new Random().nextInt(numbers.length);
                int number = numbers[index];
                if (!res.contains(number)) {
                    res.add(number);
                }
            } while (res.size() < size);
            System.out.println(res.stream()
                    .sorted().map(this::toStr)
                    .collect(Collectors.joining(", ")));
        }
    }
}
