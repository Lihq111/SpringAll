package mapper;

import bean.Student;

import java.util.List;

/**
 * @author LHQ
 * @description :学生信息Mapper接口
 */
public interface StudentMapper {
    // 插入学生信息
    int insert(Student student);
    // 查询所有学生信息
    List<Student> selectAll();
    // 根据id查询学生信息
    Student selectById(int id);
    // 根据id删除学生信息
    void deleteById(int i);

    // 根据id更新学生信息
    void updateById(int id, int age);

    Student updateIdStudent(int id, Student student);

}
