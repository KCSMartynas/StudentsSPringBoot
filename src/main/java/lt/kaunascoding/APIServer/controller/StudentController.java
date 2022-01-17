package lt.kaunascoding.APIServer.controller;

import lt.kaunascoding.APIServer.model.interfaces.StudentsService;
import lt.kaunascoding.APIServer.model.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/student")
public class StudentController {
    @Autowired
    public StudentsService studentsService;

    @GetMapping("/student/all")
    public String getAllStudents(Model model) {
        model.addAttribute("data", this.studentsService.getAllStudents());
        return "student/all";
    }

    @PostMapping("/student/add")
    public String getAllStudentsAfterPost(
           @RequestParam("name") String name,
           @RequestParam("surname") String surname,
           @RequestParam("phone") String phone,
           @RequestParam("email") String email,
            Model model
    ) {



        model.addAttribute("data", this.studentsService.getAllStudents());
        return "student/all";
    }
}
