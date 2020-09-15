package student.hackthon.team15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import student.hackthon.team15.entity.CategoriesEntity;
import student.hackthon.team15.entity.ExpensesEntity;
import student.hackthon.team15.service.ExpensesService;

import java.net.URI;
import java.util.List;

@Controller
@RequestMapping("/expenses")
public class ExpensesController {

    @Autowired
    private ExpensesService expensesService;

    @GetMapping(value="/details", produces={"application/json","application/xml"})
    public List<ExpensesEntity> getAllExpenses() {
        return expensesService.getAllExpenses();
    }

    @PostMapping(consumes={"application/json","application/xml"},
            produces={"application/json","application/xml"})
    public ResponseEntity<ExpensesEntity> addItemToExpenses(@RequestBody ExpensesEntity item) {
        expensesService.addItemsToExpenses(item);
        URI uri = URI.create("/add_expenses" + item.getId());
        return ResponseEntity.created(uri).body(item);
    }




}
