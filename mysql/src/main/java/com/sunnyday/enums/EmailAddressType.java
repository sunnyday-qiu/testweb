package com.sunnyday.enums;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/6
 */
public enum EmailAddressType {

    PERSONAL("PERSONAL"),

    WORK("WORK");

    private String value;

    EmailAddressType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
