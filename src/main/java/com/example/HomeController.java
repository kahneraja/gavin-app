package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pivotal on 3/8/17.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public Identity Identity() {
        Identity i = new Identity();
        i.firstName = "Gavin";
        i.lastName = "Shaw";
        return i;
    }

}
