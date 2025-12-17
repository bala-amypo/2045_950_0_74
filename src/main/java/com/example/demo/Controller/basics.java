package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
@Restcontroller
public class basic{
    @Getmapping("/home")
    public string name(){
        return "hello world";
    }
}