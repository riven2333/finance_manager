package student.hackthon.team15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import student.hackthon.team15.entity.ExpensesEntity;
import student.hackthon.team15.service.BillsService;

import java.util.List;

@Controller
@RequestMapping("/bills")
public class BillsController {
    @Autowired
    BillsService billsService;

    @GetMapping(value="/details", produces={"application/json","application/xml"})
    public List<ExpensesEntity> getAllBillsDetails() {
        return billsService.getAllBillsDetails();
    }
}
