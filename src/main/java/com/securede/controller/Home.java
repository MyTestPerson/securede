package com.securede.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

    @GetMapping(value = "/")
    public ModelAndView home () {

        return new ModelAndView("/home");
    }

}
