package com.sunnyday.enums;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/6
 */
public enum PhoneNumberType {

    WORK("WORK"),
    MOBILE("MOBILE"),
    HOME("HOME");

    private String value;

    PhoneNumberType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
