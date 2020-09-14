package student.hackthon.team15.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping(value="/all", produces={"application/json","application/xml"})
    public String sayHello(){
        return "hello spring boot";
    }
}
