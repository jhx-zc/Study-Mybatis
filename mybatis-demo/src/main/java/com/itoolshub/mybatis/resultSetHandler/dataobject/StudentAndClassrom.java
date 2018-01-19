package com.itoolshub.mybatis.resultSetHandler.dataobject;

import com.itoolshub.mybatis.common.domain.Classroom;
import com.itoolshub.mybatis.common.domain.Student;

import lombok.Data;

/**
 * @author Quding Ding
 * @since 2018/1/17
 */
@Data
public class StudentAndClassrom extends Student {

  private Classroom classroom;

}
