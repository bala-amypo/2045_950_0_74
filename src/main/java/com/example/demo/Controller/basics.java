package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
@Restcontroller
public class basics{
    @Getmapping("/home")
    public string name(){
        return "hello world";
    }
}