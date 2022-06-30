package com.sunnyday.visitor;

import java.util.Map;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2022/1/10
 */
public interface Element {

    /**
     *
     * @param visitor
     * @return
     */
    Map<String, String> accept(Visitor visitor);
}
