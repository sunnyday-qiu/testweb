package com.sunnyday.entity;

import com.sunnyday.enums.EmailAddressType;
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
public class EmailAddress extends BaseEntity implements Serializable {

    private String email;

    private People people;

    private EmailAddressType intendedUse;
}
