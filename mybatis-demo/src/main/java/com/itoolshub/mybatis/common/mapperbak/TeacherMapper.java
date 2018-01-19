package com.itoolshub.mybatis.common.mapperbak;

import com.itoolshub.mybatis.common.domain.Teacher;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {

  Teacher findById(Long id);

  Teacher create(Teacher createDo);

  Teacher update(Teacher updateDo);

}
