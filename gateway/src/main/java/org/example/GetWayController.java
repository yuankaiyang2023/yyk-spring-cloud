package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yuankai Yang
 */
@RestController
@RequestMapping("api2")
public class GetWayController {
 
    @RequestMapping("index")
    public String index(){
        return "Hello World! gate way";
    }
}