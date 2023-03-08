package com.sunnyday.multitenant.controller;

import com.sunnyday.multitenant.entity.Email;
import com.sunnyday.multitenant.intercepter.TenantIdInterceptor;
import com.sunnyday.multitenant.model.PersonRequest;
import com.sunnyday.multitenant.entity.Person;
import com.sunnyday.multitenant.repository.EmailRepository;
import com.sunnyday.multitenant.repository.PersonRepository;
import com.sunnyday.multitenant.resolver.TenantIdResolver;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.apache.tomcat.util.descriptor.web.ContextHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.ContentHandler;
import java.util.List;

@RestController
@AllArgsConstructor
public class PersonController {

    private final PersonRepository repository;
    private final EmailRepository emailRepository;
    private final TenantIdResolver tenantIdResolver;

    @GetMapping("/persons")
    public void getAll(String name) {
        List<Person> all = repository.getList1(name);
        all.forEach(System.out::println);
    }

    @GetMapping("/emails")
    public void getAllEmails() {
        List<Email> all = emailRepository.getList1("zhansan");
        all.forEach(System.out::println);
    }

    @Transactional
    @PostMapping("/persons")
    public void add(@RequestBody PersonRequest request) {
        String email = request.getEmail();
        Email email1 = new Email();
        email1.setEmail(email);

        emailRepository.save(email1);

        Person person = new Person();
        person.setName(request.getName());

        tenantIdResolver.setCurrentTenant(request.getTenantId());
        person.setTenantId(request.getTenantId());
        repository.save(person);
        person.setTenantId("124");
        repository.save(person);

        email1.setPerson(person);
        emailRepository.save(email1);
    }
}
