package com.sunnyday.design.behiviour.chain_of_responsibility.impl;

import com.sunnyday.design.behiviour.chain_of_responsibility.BlueNumberHandler;
import com.sunnyday.design.behiviour.chain_of_responsibility.ChainInter;
import com.sunnyday.design.behiviour.chain_of_responsibility.NumberHandler;
import com.sunnyday.design.behiviour.chain_of_responsibility.RedNumberHandler;

import java.util.List;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2021/12/28
 */
public class ChainImpl implements ChainInter {

    private List<NumberHandler> handlers;

    public ChainImpl(List<NumberHandler> handlers) {
        this.handlers = handlers;
    }

    @Override
    public void handle() {
        handlers.forEach(NumberHandler::handle);
    }

    public static void main(String[] args) {
        int[] redArr = {1, 5, 9, 10, 11, 12};
        int[] blueArr = {5, 9, 10, 11, 15, 19, 23, 28};
        ChainImpl chain2 = new ChainImpl(List.of(new BlueNumberHandler(blueArr), new RedNumberHandler(redArr)));
        for (int i = 0; i < 5; i++) {
            chain2.handle();
        }
    }

}
