package com.sunnyday.multitenant.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
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

    private String email;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id")
    @Fetch(FetchMode.JOIN)
    private Person person;
}
