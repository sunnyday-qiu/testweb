package com.sunnyday.entity;

import com.sunnyday.enums.AddressType;
import com.sunnyday.enums.PhoneNumberType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/6
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PhoneNumber extends BaseEntity implements Serializable {

    private String number;

    private PhoneNumberType intendedUse;

    private People people;
}