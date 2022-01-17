package lt.kaunascoding.APIServer.model.mappers;

import lt.kaunascoding.APIServer.model.vo.MarkVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

public interface MarkMapper {
    @Select("SELECT * FROM `student_marks` WHERE id = #{markId}")
    MarkVO getMark(@Param("markId") Integer markId);

    @Select("SELECT * FROM `student_marks`")
    ArrayList<MarkVO> getAllMarks();

    @Insert("INSERT INTO `student_marks` (`student_id`, `title`, `mark`) VALUES (#{studentId}, #{title}, #{mark})")
    void addMark(@Param("studentId") Integer studentId,
                 @Param("title") String title,
                 @Param("mark") Integer mark);

    @Delete("DELETE FROM `student_marks` WHERE `id` = #{markId}")
    void deleteMarkById(@Param("markId") Integer markId);
}
