package com.itoolshub.mybatis.common.mapperbak;

import com.itoolshub.mybatis.common.domain.Classroom;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClassroomMapper {

  Classroom findById(Long id);

  Classroom create(Classroom createDo);

  Classroom update(Classroom updateDo);

}
