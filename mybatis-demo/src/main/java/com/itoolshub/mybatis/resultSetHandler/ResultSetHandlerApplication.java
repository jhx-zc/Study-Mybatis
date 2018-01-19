package com.itoolshub.mybatis.resultSetHandler;

import com.itoolshub.mybatis.common.BaseSpringMybatisApplication;
import com.itoolshub.mybatis.common.domain.Student;
import com.itoolshub.mybatis.resultSetHandler.dataobject.StudentAndClassrom;
import com.itoolshub.mybatis.resultSetHandler.mapper.StudentMapper;

import org.assertj.core.util.Lists;
import org.junit.Assert;
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
    /**
     * resultMap形式可以完全映射到字段
     */
    final Student student = studentMapper.findById(1L);
    Assert.assertTrue(student.getClassroomId() == 1L);
    System.out.println(student);

    /**
     * 基于type返回的classroomId没有映射到,自然原因是因为命名不匹配导致.
     */
    final Student student2 = studentMapper.findByIdByResultType(1L);
    Assert.assertEquals(student2.getClassroomId(),null);
    System.out.println(student2);
  }

  /**
   * resultMap继承预计关联
   */
  @Test
  public void testFindStudentClassroom() {
    final StudentAndClassrom studentClassrom = studentMapper.findByStudentId(1L);
    System.out.println(studentClassrom);
  }

  /**
   * 批量插入写回主键,貌似不支持h2,rs.next()只有一条.
   */
  @Test
  public void testCreate() {
    Student student1 = new Student();
    student1.setClassroomId(3L);
    student1.setName("张五");
    Student student2 = new Student();
    student2.setClassroomId(4L);
    student2.setName("张六");
    studentMapper.create(Lists.newArrayList(student1, student2));

    System.out.println(student1);
    System.out.println(student2);
  }
}
