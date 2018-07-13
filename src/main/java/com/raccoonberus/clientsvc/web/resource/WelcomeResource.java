package com.raccoonberus.clientsvc.web.resource;

import com.raccoonberus.clientsvc.web.model.CommonRespose;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeResource {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public CommonRespose hello() {
        String welcomeMsg = "Hello, everyone!<br/>This is client service!<br/>It can collect, validate and sort useful information.";
        return new CommonRespose(true).setResult(welcomeMsg);
    }

}
