package com.sunnyday.chain.impl;

import com.sunnyday.chain.ChainInter;
import com.sunnyday.chain.NumberHandler;

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
    public void filter(Integer req, List<Integer> response) {
        handlers.forEach(handler -> handler.handler(req, response));
        System.out.println(response);
    }

}
