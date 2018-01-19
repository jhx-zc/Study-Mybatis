package com.itoolshub.mybatis.common.mapperbak;

import com.itoolshub.mybatis.common.domain.Student;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

  Student findById(Long id);

  Student findByIdByResultType(Long id);

  Student create(Student createDo);

  Student update(Student updateDo);

}
