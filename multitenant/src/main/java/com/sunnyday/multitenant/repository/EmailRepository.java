package com.sunnyday.multitenant.repository;

import com.sunnyday.multitenant.entity.Email;
import com.sunnyday.multitenant.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/8
 */
@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {

    @Query("select e from Email e where e.email = ?1")
    List<Email> getList(String name);

    @Query("select e from Email e where e.person.name = ?1")
    List<Email> getList1(String name);
}
