package com.itoolshub.mybatis.resultSetHandler;

import com.itoolshub.mybatis.common.BaseSpringMybatisApplication;
import com.itoolshub.mybatis.common.domain.Student;
import com.itoolshub.mybatis.resultSetHandler.mapper.StudentMapper;

import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Quding Ding
 * @since 2018/1/15
 */
@MapperScan("com.itoolshub.mybatis.resultSetHandler.mapper")
public class ResultSetHandlerApplication extends BaseSpringMybatisApplication {

  @Autowired
  private StudentMapper studentMapper;

  @Test
  public void testFindById() {
    final Student student = studentMapper.findById(1L);
    System.out.println(student);
  }

}
