package com.sunnyday.enums;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/6
 */
public enum AddressType {

    WORK("WORK"),
    DELIVERY("DELIVERY"),
    HOME("HOME");

    private String value;

    AddressType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
