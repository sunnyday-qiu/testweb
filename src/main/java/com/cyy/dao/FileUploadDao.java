package com.cyy.dao;


import com.cyy.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface FileUploadDao {
    
    
    @Select("select * from student")
    List<Student> list();

}
