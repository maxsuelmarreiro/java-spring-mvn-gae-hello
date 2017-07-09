package com.appspot.event.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by '-Maxsuel on 09/07/2017.
 */
@Controller
@RequestMapping("/admin")
public class Hello {
    @RequestMapping("/maxsuel")
    public ModelAndView hello() {
        String message = "Welcome to Spring!";
        return new ModelAndView("admin/max", "message", message);
    }
}
