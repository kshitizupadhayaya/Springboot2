package com.web.demo1;

import com.web.demo1.student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@ResponseBody

public class Handler {
    @GetMapping
    public List<Student> student()
    {
        return List.of(
                new Student(
                        1,
                        "Kshitiz",
                        21,
                        "kxupadhayaya@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5)
                        )
        );
    }

}
