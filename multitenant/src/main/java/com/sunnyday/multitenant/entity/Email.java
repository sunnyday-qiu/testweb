package com.sunnyday.multitenant.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.TenantId;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/8
 */
@Data
@Entity
public class Email {

    @Id
    @SequenceGenerator(name = "email_seq", sequenceName = "email_seq", allocationSize = 1)
    @GeneratedValue(generator = "email_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(updatable = false)
    private String email;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id")
    @Fetch(FetchMode.JOIN)
    private Person person;

    @TenantId
    @Column(name = "tenant_id")
    private String tenantId;
}
