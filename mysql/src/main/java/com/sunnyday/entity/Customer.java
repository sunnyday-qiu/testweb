package com.sunnyday.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/1
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends People implements Serializable {

    private String title;

    private String notes;

    private Organization organization;

    private Long ownerId;

}
