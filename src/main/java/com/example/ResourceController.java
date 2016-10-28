package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rafael on 25/10/2016.
 */
@RestController
@RequestMapping("/resource")
public class ResourceController {

    @RequestMapping(method = RequestMethod.GET)
    String readResource() {
        return "hello!";
    }
}