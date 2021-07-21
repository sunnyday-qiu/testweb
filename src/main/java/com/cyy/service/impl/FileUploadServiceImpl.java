package com.cyy.service.impl;

import com.cyy.dao.FileUploadDao;
import com.cyy.domain.Student;
import com.cyy.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileUploadServiceImpl implements FileUploadService {
    
    @Autowired
    private FileUploadDao fileUploadDao;
    
    @Override
    public List<Student> list() {
        return fileUploadDao.list();
    }
}
