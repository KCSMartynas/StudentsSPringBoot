package lt.kaunascoding.APIServer.model.vo;

import lombok.Data;

@Data
public class StudentVO {
    private Integer id;
    private String name;
    private String surname;
    private String phone;
    private String email;
}
