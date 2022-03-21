package com.cyy.visitor;

import java.time.LocalDate;
import java.util.Map;


public class ElementA implements Element {
    @Override
    public String toString() {
        return "ElementA{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                ", field3=" + field3 +
                '}';
    }

    private String field1 =  "a";
    private int field2 = 1;
    private LocalDate field3 = LocalDate.now();

    @Override
    public Map<String, String> accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
