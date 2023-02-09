package com.sunnyday.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/6
 */
@Data
public class BaseEntity implements Serializable {

    private Long id;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String createdBy;

    private String updatedBy;

}
