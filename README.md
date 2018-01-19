
# Mybatis源码阅读学习使用

Mybatis版本 3.4.6-SNAPSHOT

数据库: H2

# 使用指南

内置简单数据关系

**Student**: id name classroom_id

**Classroom**: id title

**Teacher**: id name
 
**TeacherClassroom**: id teacher_id classroom_id


新建一个包,然后里面继承`BaseSpringMybatisApplication`这个类,配置下Mapper具体的扫包目录,接下来就随心所欲的写Test了.

```java
@MapperScan("com.itoolshub.mybatis.resultSetHandler.mapper")
public class ResultSetHandlerApplication extends BaseSpringMybatisApplication {

  @Autowired
  private StudentMapper studentMapper;
  /**
   * resultMap继承预计关联
   */
  @Test
  public void testFindStudentClassroom() {
    final StudentAndClassrom studentClassrom = studentMapper.findByStudentId(1L);
    System.out.println(studentClassrom);
  }

}

```

# 备注

个人阅读文章:  [http://mrdear.cn/tags/mybatis/](http://mrdear.cn/tags/mybatis/)
