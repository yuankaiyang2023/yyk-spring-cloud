package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yuankai Yang
 */
@RestController
public class HelloController {
 
    @RequestMapping("index")
    public String index(){
        return "Hello World!";
    }
}