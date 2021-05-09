package com.polhdez.helloWorld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/{name}", method=GET)
    @ResponseBody
    public String getHelloName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}