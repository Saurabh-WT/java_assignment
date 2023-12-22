package com.prakhar.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @GetMapping
    public ResponseEntity getAllUsers(){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity getUser(@PathVariable int id){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @PostMapping
    public ResponseEntity addUser(){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable int id){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable int id){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
