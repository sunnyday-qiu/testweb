package com.sunnyday.multitenant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import org.hibernate.annotations.TenantId;

import java.util.List;


/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/8
 */
@Data
@Entity
public class Person {

    @Id
    @SequenceGenerator(name = "person_seq", sequenceName = "person_seq", initialValue = 1000, allocationSize = 1)
    @GeneratedValue(generator = "person_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @TenantId
    private String tenantId;

    private String name;

}
