package com.cyy.visitor;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class VisitorA implements Visitor {

    @Override
    public Map<String, String> visit(ElementA elementA) {
        Class<? extends ElementA> aClass = elementA.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        HashMap<String, String> map = new HashMap<>();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(Boolean.TRUE);
            try {
                map.put(declaredField.getName(), String.valueOf(declaredField.get(elementA)));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    @Override
    public Map<String, String> visit(ElementB elementB) {
        Class<? extends ElementB> aClass = elementB.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        HashMap<String, String> map = new HashMap<>();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(Boolean.TRUE);

            try {
                map.put(declaredField.getName(), String.valueOf(declaredField.get(elementB)));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }
}
