package com.sunnyday.enums;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/6
 */
public enum OrganizationType {
    CORPORATE("CORPORATE"),
    GOVERNMENT("GOVERNMENT"),
    TRUSTEE("TRUSTEE");

    private String value;

    OrganizationType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
