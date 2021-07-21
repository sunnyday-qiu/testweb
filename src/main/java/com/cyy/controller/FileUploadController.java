package com.cyy.controller;


import com.cyy.domain.Student;
import com.cyy.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    
    @GetMapping("detail")
    public Student detail(@RequestParam(value = "id") String id) {
        return fileUploadService.selectById(id);
    }
    
    @PostMapping
    public int add(@RequestBody Student student) {
        return fileUploadService.insert(student);
    }
    
    @PutMapping
    public int update(@RequestBody Student student) {
        return fileUploadService.update(student);
    }
    
    @DeleteMapping
    public int delete(@RequestParam(value = "id") String id) {
        return fileUploadService.delete(id);
    }
}
