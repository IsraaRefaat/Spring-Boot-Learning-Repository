package com.esraa.springsecdemo.controller;


import com.esraa.springsecdemo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Bilal","Java"),
            new Student(2,"Esraa","Java"),
            new Student(3,"Menna","JS"),
            new Student(4,"Omar","C#")
    ));

    @GetMapping("token")
    public CsrfToken token(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }


    @GetMapping("students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("student")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }




}
