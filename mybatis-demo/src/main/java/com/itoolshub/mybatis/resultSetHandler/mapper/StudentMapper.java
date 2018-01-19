package com.itoolshub.mybatis.resultSetHandler.mapper;

import com.itoolshub.mybatis.common.domain.Student;
import com.itoolshub.mybatis.resultSetHandler.dataobject.StudentAndClassrom;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {

  Student findById(Long id);

  Student findByIdByResultType(Long id);

  StudentAndClassrom findByStudentId(Long id);

  Integer create(@Param("list") List<Student> students);
}
