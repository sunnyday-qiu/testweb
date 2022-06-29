package com.cyy.dao;

import com.cyy.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileUploadDaoImpl implements FileUploadDao {
    @Override
    public List<Student> list() {
        return null;
    }

    @Override
    public Student selectById(String id) {
        return null;
    }

    @Override
    public int insert(Student student) {
        return 0;
    }

    @Override
    public int update(Student student) {
        return 0;
    }

    @Override
    public int delete(String id) {
        return 0;
    }
}
