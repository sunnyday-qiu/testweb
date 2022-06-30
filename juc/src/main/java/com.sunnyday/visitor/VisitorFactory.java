package com.sunnyday.visitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VisitorFactory {

    private List<Element> elements = new ArrayList<>();

    public void accept(Visitor visitor) {
        HashMap<String, String> res = new HashMap<>();
        Iterator<Element> iterator = elements.iterator();
        while (iterator.hasNext()) {
            Map<String, String> temp = iterator.next().accept(visitor);
            res.putAll(temp);
        }
        res.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    public static void main(String[] args) {
        VisitorFactory visitorFactory = new VisitorFactory();
        visitorFactory.add(new ElementA());
        visitorFactory.add(new ElementB());
        visitorFactory.accept(new VisitorA());
        System.out.println("---------");
        visitorFactory.accept(new VisitorB());
    }
}
