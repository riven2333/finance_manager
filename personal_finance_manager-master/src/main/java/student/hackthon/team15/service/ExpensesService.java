package student.hackthon.team15.service;

import student.hackthon.team15.entity.CategoriesEntity;
import student.hackthon.team15.entity.ExpensesEntity;

import java.util.List;

public interface ExpensesService {
    public List<ExpensesEntity> getAllExpenses();
    public void addItemsToExpenses(ExpensesEntity expensesEntity);
    public void addItemsToCategory(CategoriesEntity categoriesEntity);

    public List<CategoriesEntity> getAllCategories();
    public Boolean IfCategoriesContainsId(int id);
    public void modifyItemInCategories(CategoriesEntity categoriesEntity);
    public void deleteItemInCategories(int id);
}
