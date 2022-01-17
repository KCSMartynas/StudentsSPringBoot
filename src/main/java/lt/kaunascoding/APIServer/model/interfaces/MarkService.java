package lt.kaunascoding.APIServer.model.interfaces;

import lt.kaunascoding.APIServer.model.vo.MarkVO;

import java.util.ArrayList;


public interface MarkService {

    MarkVO getMarkById(Integer id);

    ArrayList<MarkVO> getAllMarks();

    void addMark(Integer studentId, String title, Integer mark);

    void deleteMarkById(Integer markId);
}
