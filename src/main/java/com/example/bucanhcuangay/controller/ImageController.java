package com.example.bucanhcuangay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ImageController {

    @GetMapping("/home")
    public ModelAndView showImg(){
        ModelAndView modelAndView = new ModelAndView("/home");
        return modelAndView;
    }
}
