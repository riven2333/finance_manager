package student.hackthon.team15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import student.hackthon.team15.dao.TestImpl;
import student.hackthon.team15.entity.productPerson;

import java.util.List;



@RestController
public class TestController {
    @Autowired
    private TestImpl test;

    @GetMapping(value="/sum", produces={"application/json","application/xml"})
    public List<productPerson> getSum(){
        return test.findAll();
    }
}
