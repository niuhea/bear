package com.bear.controller;

import com.bear.model.UserInfoResp;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is a rest api controller
 *
 * Created by nick on 2017/5/26.
 */
@RestController
public class ApiController {

    @RequestMapping(path = "/api/test", method = RequestMethod.GET)
    public String test(){
        return "api test";
    }


    @RequestMapping(path = "/api/welcome/{name}", method = RequestMethod.GET)
    public String welcome(@PathVariable("name") String name){
        return "welcome " + name + " !";
    }


    @RequestMapping(path = "/api/json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public UserInfoResp welcome(){
        UserInfoResp resp = new UserInfoResp();
        resp.setName("nick");
        resp.setAge(30);

        return resp;
    }

}
