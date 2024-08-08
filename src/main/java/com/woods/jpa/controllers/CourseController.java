package com.woods.jpa.controllers;

import com.woods.jpa.entities.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/course")
@RestController
public class CourseController {

    @GetMapping
    public Course getCourse() {
        return new Course(UUID.randomUUID(), "How to course", "Unknown");
    }

}
