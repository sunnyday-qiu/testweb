package com.cyy.chain;

import java.util.List;
import java.util.Random;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2021/12/28
 */
public interface NumberHandler<T> {

    Random random = new Random();

    default String buildStr(int bound) {
        int i = random.nextInt(bound) + 1;
        if (i < 9) {
            return "0" + i;
        }
        return String.valueOf(i);
    }

    void handler(Integer request, List<String> response);
}
