package lt.kaunascoding.APIServer.controller;

import lt.kaunascoding.APIServer.model.interfaces.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/mark")
public class MarkController {
    @Autowired
    public MarkService markService;

    @GetMapping("/mark/all")
    public String getAllMarks(Model model) {
        model.addAttribute("data", this.markService.getAllMarks());
        return "mark/all";
    }

    @PostMapping("/mark/add")
    public String getAllMarksAfterPost(
            @RequestParam("studentId") Integer studentId,
            @RequestParam("title") String title,
            @RequestParam("mark") Integer mark,
            Model model
    ) {
        this.markService.addMark(studentId,title, mark);

        model.addAttribute("data", this.markService.getAllMarks());
        return "mark/all";
    }

    @GetMapping("/mark/delete/{id}")
    public String deleteMark(
            @PathVariable("id") Integer markId,
            Model model
    ) {
        this.markService.deleteMarkById(markId);

        model.addAttribute("data", this.markService.getAllMarks());
        return "mark/all";
    }
}
