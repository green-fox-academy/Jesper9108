package com.example.dependencies.Controller;

import com.example.dependencies.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gfa")
public class GFAcontroller {

    private StudentService studentService;

    @Autowired
    public GFAcontroller(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/list")
    public String listStudents(Model model){
        model.addAttribute("count", studentService.count());
        model.addAttribute("studentlist", studentService.findAll());
        return "gfastudents";
    }

    @GetMapping("/add")
    public String addStudentForm(Model model, @ModelAttribute("student") String student ){
        model.addAttribute("student", student);
        return "add";
    }

    @GetMapping("/save")
    public String saveStudent(@ModelAttribute("student") String student){
        studentService.save(student);
        return "redirect:/gfa/list";
    }

    @GetMapping("/check")
    public String checkStudent(Model model, @ModelAttribute("student") String student){
        model.addAttribute("contains", studentService.studentChecker(student));
        return "gfacheck";
    }


//    @GetMapping("/add")
//    public String addStudentForm()



}
