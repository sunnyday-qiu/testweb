package com.sunnyday.chain;

import java.util.List;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2021/12/28
 */
public interface ChainInter {

    void filter(Integer req, List<Integer> response);
}
