package com.cyy.visitor;

import java.util.Map;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2022/1/10
 */
public interface Visitor {


    Map<String, String> visit(ElementA elementA);
    Map<String, String> visit(ElementB elementB);

}
