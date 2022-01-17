package lt.kaunascoding.APIServer.model.vo;

import lombok.Data;

@Data
public class MarkVO {
    private Integer id;
    private Integer student_id;
    private String title;
    private Integer mark;
    private String date;
}

