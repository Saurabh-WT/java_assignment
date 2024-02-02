package com.prakhar.studentmanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @GetMapping
    public ResponseEntity allStudent(){
        return ResponseEntity.ok("wrking....");
    }
//    @GetMapping("/{id}")
//     public ResponseEntity findStudentById(){
//        try{
//
//        }catch (Exception e){
//            e.setStackTrace();
//        }
//    }
}
