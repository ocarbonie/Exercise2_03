package com.example.exercise2_033;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/employeeForm")
    public String loadEmployeeForm(Model model){
        model.addAttribute("employee", new Employee());
        return "employeeForm";
    }

    @PostMapping("/employeeForm")
    public String processEmployeeForm(@ModelAttribute Employee employee, Model model){
        model.addAttribute("employee", employee);
        return "employedResults";
    }


}
