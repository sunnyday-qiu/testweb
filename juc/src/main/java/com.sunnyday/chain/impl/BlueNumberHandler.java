package com.sunnyday.chain.impl;

import com.sunnyday.chain.NumberHandler;

import java.util.ArrayList;
import java.util.List;

public class BlueNumberHandler<T> implements NumberHandler<Integer> {

    @Override
    public void handler(Integer request, List<String> response) {
        List temp = new ArrayList();
        do {
            String str = buildStr(34);
            if (!temp.contains(str)) {
                temp.add(str);
            }
        } while (temp.size() < 5);
        response.addAll(temp);
    }

    public static void main(String[] args) {
        ArrayList<NumberHandler> handlers = new ArrayList<>();
        handlers.add(new BlueNumberHandler());
        handlers.add(new RedNumberHandler());
        ChainImpl chain = new ChainImpl(handlers);
        chain.filter(7, new ArrayList<>());
    }
}
