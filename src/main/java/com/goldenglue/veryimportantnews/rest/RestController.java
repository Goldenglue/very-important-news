package com.goldenglue.veryimportantnews.rest;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/mde")
    public String mde() {
        return "mde";
    }
}
