package com.example.demo.controller;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Student;
import com.example.demo.dao.EmployeeDAO;
import com.example.demo.dao.StudentDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class HomeController {

    private EmployeeDAO employeeDAO;

    public HomeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration() {
        return "Student_Registration";
    }

    @RequestMapping(value = {"", "/", "home"})
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/aboutUS")
    public String aboutUS() {
        return "staff";
    }
    @RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
    public String newEmployee() {
        return "addEmployee";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }


    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String createEmployee(@Valid Employee employee,  Model model) {


            model.addAttribute("users", employeeDAO.save(employee));

        return "addSuccess";
    }

    @GetMapping(value = "/findAllEmployee" , produces = "application/json")
    public String findAllStudent( Model model) {
        List<Employee> listCustomer = employeeDAO.findAllEmployee();
        model.addAttribute("users", listCustomer);
        return "staff";

    }

    @GetMapping(value = "/findAllStudent")
    public String findAllStudent() {
        return "displayStudent";

    }

}
