package lt.kaunascoding.APIServer.model.services;

import lt.kaunascoding.APIServer.model.mappers.StudentsMapper;
import lt.kaunascoding.APIServer.model.interfaces.StudentsService;
import lt.kaunascoding.APIServer.model.vo.StudentVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentsService {

    private final StudentsMapper studentsMapper;

    public StudentServiceImpl(StudentsMapper studentsMapper) {
        this.studentsMapper= studentsMapper;
    }

    @Override
    public StudentVO getStudentById(String id) {
        return this.studentsMapper.getUser(id);
    }

    @Override
    public ArrayList<StudentVO> getAllStudents() {
        return this.studentsMapper.getAllStudents();
    }
}
