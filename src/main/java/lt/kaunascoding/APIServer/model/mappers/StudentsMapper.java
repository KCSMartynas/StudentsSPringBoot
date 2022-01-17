package lt.kaunascoding.APIServer.model.mappers;

import lt.kaunascoding.APIServer.model.vo.StudentVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

public interface StudentsMapper {
    @Select("SELECT * FROM `students` WHERE id = #{userId}")
    StudentVO getUser(@Param("userId") String userId);

    @Select("SELECT * FROM `students`")
    ArrayList<StudentVO> getAllStudents();

    @Insert("INSERT INTO `students` (`name`, `surname`, `phone`, `email`) VALUES (#{name}, #{surname}, #{phone}, #{email})")
    void addStudent(@Param("name") String name,
                    @Param("surname") String surname,
                    @Param("phone") String phone,
                    @Param("email") String email);
}
