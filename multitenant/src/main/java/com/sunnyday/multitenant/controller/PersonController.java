package com.sunnyday.multitenant.controller;

import com.sunnyday.multitenant.entity.Email;
import com.sunnyday.multitenant.model.PersonRequest;
import com.sunnyday.multitenant.entity.Person;
import com.sunnyday.multitenant.repository.EmailRepository;
import com.sunnyday.multitenant.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonController {

    private final PersonRepository repository;
    private final EmailRepository emailRepository;

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

    @PostMapping("/persons")
    public void add(@RequestBody PersonRequest request) {
        Person person = new Person();
        person.setName(request.getName());
        repository.save(person);

        String email = request.getEmail();
        Email email1 = new Email();
        email1.setEmail(email);
        email1.setPerson(person);
        emailRepository.save(email1);
    }
}
