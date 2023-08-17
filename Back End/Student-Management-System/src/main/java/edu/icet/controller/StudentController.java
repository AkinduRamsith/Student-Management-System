package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import edu.icet.service.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@Slf4j
public class StudentController {
    @Autowired
    StudentService service;
    @GetMapping("/get-students/{name}")
    public ArrayList<Student> getStudent(@PathVariable String name) {
        System.out.println(service.getStudent(name).size());

        return service.getStudent(name);

    }
}
