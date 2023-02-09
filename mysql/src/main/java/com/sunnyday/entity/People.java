package com.sunnyday.entity;

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
public abstract class People extends BaseEntity implements Serializable {

    private String firstName;

    private String lastName;

    private String tenantCode;
}
