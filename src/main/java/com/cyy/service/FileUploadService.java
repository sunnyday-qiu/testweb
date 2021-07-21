package com.cyy.service;

import com.cyy.domain.Student;

import java.util.List;

public interface FileUploadService {


    List<Student> list();
    
    Student selectById(String id);
    
    Student insert(Student student);
    
    int update(Student student);
    
    int delete(String id);
    
    
}
