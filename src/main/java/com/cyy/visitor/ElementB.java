package com.cyy.visitor;

import java.time.LocalDate;
import java.util.Map;

public class ElementB implements Element {
    @Override
    public String toString() {
        return "ElementB{" +
                "field_1='" + field_1 + '\'' +
                ", field_2=" + field_2 +
                ", field_3=" + field_3 +
                '}';
    }

    private String field_1 = "b";
    private int field_2 = 2;
    private LocalDate field_3 = LocalDate.now().plusDays(1);


    @Override
    public Map<String, String> accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
