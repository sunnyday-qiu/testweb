package com.sunnyday.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/6
 */
@Data
public class Organization implements Serializable {

    private Long id;

    private String name;

    private String address;

    private String businessNo;

}
