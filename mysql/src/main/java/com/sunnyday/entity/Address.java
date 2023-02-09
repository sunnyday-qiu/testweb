package com.sunnyday.entity;

import com.sunnyday.enums.AddressType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/6
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Address extends BaseEntity {

    private String state;

    private String country;

    private String city;

    private String line1;

    private String line2;

    private String postCode;

    private AddressType addressType;

    private People people;
}