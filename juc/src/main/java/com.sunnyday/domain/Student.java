package com.sunnyday.domain;


import lombok.Data;

import java.util.Date;

@Data
public class Student {

    private String id;
    private int age;
    private String name;
    private char gender;
    private Date birthday;

}
