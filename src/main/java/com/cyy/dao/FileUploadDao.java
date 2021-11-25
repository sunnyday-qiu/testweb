package com.cyy.dao;


import com.cyy.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface FileUploadDao {

    String TEST = "HOTFIX_1";

    @Select("select * from student")
    List<Student> list();
    
    @Select("select * from student where id =#{id}")
    Student selectById(String id);
    
    @Insert("insert into student (name, age, gender, birthday) values(#{name}, #{age}, #{gender}, #{birthday})")
    int insert(Student student);
    
    @Update("update student set name=#{name}, gender=${gender}, age=#{age}, gender=#{gender}, birthday=#{birthday} where id = #{id}")
    int update(Student student);
    
    @Delete("delete from student where id=#{id}")
    int delete(String id);
}
