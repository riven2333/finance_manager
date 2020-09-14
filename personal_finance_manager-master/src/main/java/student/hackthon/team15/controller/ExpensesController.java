//package student.hackthon.team15.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import student.hackthon.team15.entity.CategoriesEntity;
//import student.hackthon.team15.entity.ExpensesEntity;
//import student.hackthon.team15.service.ExpensesService;
//
//import java.net.URI;
//import java.util.List;
//
//@Controller
//@RequestMapping("/expenses")
//public class ExpensesController {
//
//    @Autowired
//    private ExpensesService expensesService;
//
//    @GetMapping(value="/details", produces={"application/json","application/xml"})
//    public List<ExpensesEntity> getAllExpenses() {
//        return expensesService.getAllExpenses();
//    }
//
//    @PostMapping(consumes={"application/json","application/xml"},
//            produces={"application/json","application/xml"})
//    public ResponseEntity<ExpensesEntity> addItemToExpenses(@RequestBody ExpensesEntity item) {
//        expensesService.addItemsToExpenses(item);
//        URI uri = URI.create("/category_manage" + item.getId());
//        return ResponseEntity.created(uri).body(item);
//    }
//
//    @PostMapping(consumes={"application/json","application/xml"},
//            produces={"application/json","application/xml"})
//    public ResponseEntity<CategoriesEntity> addItemToCategory(@RequestBody CategoriesEntity item) {
//        expensesService.addItemsToCategory(item);
//        URI uri = URI.create("/category_manage" + item.getId());
//        return ResponseEntity.created(uri).body(item);
//    }
//
//    @PutMapping(value="/category_manage", consumes={"application/json","application/xml"})
//    public ResponseEntity modifyItemInCategory(@RequestBody CategoriesEntity item) {
//        if (!expensesService.IfCategoriesContainsId(item.getId()))
//            return ResponseEntity.notFound().build();
//        else {
//            expensesService.modifyItemInCategories(item);
//            return ResponseEntity.ok().build();
//        }
//    }
//
//    @DeleteMapping("/category_manage/{id}")
//    public ResponseEntity deleteItemInCategory(@PathVariable int id) {
//        if (!expensesService.IfCategoriesContainsId(id))
//            return ResponseEntity.notFound().build();
//        else {
//            expensesService.deleteItemInCategories(id);
//            return ResponseEntity.ok().build();
//        }
//    }
//
//
//}
