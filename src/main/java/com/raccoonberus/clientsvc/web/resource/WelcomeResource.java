package com.raccoonberus.clientsvc.web.resource;

import com.raccoonberus.clientsvc.web.model.CommonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeResource {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public CommonResponse hello() {
        String welcomeMsg = "Hello, everyone!<br/>This is client service!<br/>It can collect, validate and sort useful information.";
        return new CommonResponse(true).setResult(welcomeMsg);
    }

}
