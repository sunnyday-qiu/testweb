package com.cyy.chain.impl;

import com.cyy.chain.NumberHandler;

import java.util.ArrayList;
import java.util.List;

public class RedNumberHandler<T> implements NumberHandler<Integer> {


    @Override
    public void handler(Integer request, List<String> response) {
        List temp = new ArrayList();
        do {
            String str = buildStr(11);
            if (!temp.contains(str)) {
                temp.add(str);
            }
        } while (temp.size() < 2);
        response.addAll(temp);
    }

}
