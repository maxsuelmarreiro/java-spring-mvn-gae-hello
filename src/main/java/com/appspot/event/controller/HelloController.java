package com.appspot.event.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by '-Maxsuel on 08/07/2017.
 */

@Controller
public class HelloController {
    @RequestMapping(value = "/")
    public String home(){
        return "index";
    }
}
