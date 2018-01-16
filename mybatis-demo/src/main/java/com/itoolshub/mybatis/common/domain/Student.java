package com.itoolshub.mybatis.common.domain;

import lombok.Data;

@Data
public class Student {

  private Long id;
  /**
   * 学生姓名
   */
  private String name;
  /**
   * 课堂id
   */
  private Long classroomId;

}
