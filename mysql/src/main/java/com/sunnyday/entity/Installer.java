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
public class Installer extends People implements Serializable {

    private Long cecInstallerId;

}
