package com.cyy.controller;


import com.cyy.domain.Student;
import com.cyy.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * test
 *
 * @author qiudong
 * @date 2021/7/21 10:01
 */
@RestController
@RequestMapping("/student")
public class FileUploadController {
    
    @Autowired
    private FileUploadService fileUploadService;
    
    @GetMapping
    public String test(@RequestParam(value = "str", required = false) String str) {
        return "Hello world";
    }
    
    
    @GetMapping("list")
    public List<Student> list() {
        return fileUploadService.list();
    }
    
    
}
