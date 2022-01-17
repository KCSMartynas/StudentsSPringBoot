package lt.kaunascoding.APIServer.model.services;

import lt.kaunascoding.APIServer.model.interfaces.MarkService;
import lt.kaunascoding.APIServer.model.mappers.MarkMapper;
import lt.kaunascoding.APIServer.model.vo.MarkVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MarkServiceImpl implements MarkService {

    private final MarkMapper markMapper;

    public MarkServiceImpl(MarkMapper markMapper) {
        this.markMapper = markMapper;
    }

    @Override
    public MarkVO getMarkById(Integer id) {
        return this.markMapper.getMark(id);
    }

    @Override
    public ArrayList<MarkVO> getAllMarks() {
        return this.markMapper.getAllMarks();
    }

    @Override
    public void addMark(Integer studentId, String title, Integer mark) {
        this.markMapper.addMark(studentId, title, mark);
    }


    @Override
    public void deleteMarkById(Integer markId) {
        this.markMapper.deleteMarkById(markId);
    }
}
