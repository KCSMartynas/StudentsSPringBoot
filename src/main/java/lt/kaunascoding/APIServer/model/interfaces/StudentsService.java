package lt.kaunascoding.APIServer.model.interfaces;

import lt.kaunascoding.APIServer.model.vo.StudentVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface StudentsService {

    StudentVO getStudentById (String id);

    ArrayList<StudentVO> getAllStudents();

    void addStudent(String name, String surname, String phone, String email);
}
