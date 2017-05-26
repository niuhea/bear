package com.bear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This is a web page redirect Controller
 *
 * Created by nick on 2017/5/26.
 */
@Controller
public class WebPageController {

    @RequestMapping(path = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(path = "/welcome")
    public String welcome(){
        return "welcome";
    }
}
