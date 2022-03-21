package com.cyy.visitor;

import java.util.HashMap;
import java.util.Map;

public class VisitorB implements Visitor {

    @Override
    public Map<String, String> visit(ElementA elementA) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ElementA: ", elementA.toString());
        return map;
    }

    @Override
    public Map<String, String> visit(ElementB elementB) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ElementB: ", elementB.toString());
        return map;
    }
}
