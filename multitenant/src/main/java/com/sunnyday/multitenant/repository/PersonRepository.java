package com.sunnyday.multitenant.repository;

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
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("select p from Person p where p.name = ?1")
    List<Person> getList(String name);

    @Query(value = "select p.* from person p where p.name = ?1", nativeQuery = true)
    List<Person> getList1(String name);

}
