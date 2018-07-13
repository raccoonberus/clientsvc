package com.raccoonberus.clientsvc.web.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeResource {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Hello, everyone!<br/>This is client service!<br/>It can collect, validate and sort useful information.";
    }

}
