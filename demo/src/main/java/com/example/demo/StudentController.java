package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")

public class StudentController {
    private List<Student> students = new ArrayList<>();

    public StudentController() {
        students.add(new Student(1, "Ranjith", "ECE"));
        students.add(new Student(2, "Arun", "CSE"));
    }

    // GET
    @GetMapping("/getData")
    public List<Student> getStudents() {

        for (Student s : students){
            String s1 = s.toString();
            System.out.println(s1);
        }
        return students;

    }

    // Post
    @PostMapping("/addStudent")
    public String addStudent(
            @RequestParam String name,
            @RequestParam String department) {

        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        int i =2;
        students.add(new Student(i+1, name, department));
        return "Student added: " + name + " - " + department;
    }
    }


