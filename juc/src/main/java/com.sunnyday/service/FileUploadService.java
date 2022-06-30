package com.sunnyday.service;

import com.sunnyday.domain.Student;

import java.util.List;

public interface FileUploadService {


    List<Student> list();
    
    Student selectById(String id);
    
    int insert(Student student);
    
    int update(Student student);
    
    int delete(String id);
    
    
}
