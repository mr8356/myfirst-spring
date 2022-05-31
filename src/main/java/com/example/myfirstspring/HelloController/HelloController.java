package com.example.myfirstspring.HelloController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data" , "hello!!");
        return "hello";
    }

    @GetMapping("hello-vscode")
    public String helloVscode(Model model){
        model.addAttribute("name" , name);
        return "<h1>hello vs</h1>";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name") String name , Model model){
        model.addAttribute("name" , name);
        System.out.println("hohohoh");
        return "hello-template";
    }
    //modified with git vscode
}
