package student.hackthon.team15.dao;

import student.hackthon.team15.entity.ExpensesEntity;

import java.util.List;

public interface ExpensesEntityDao {
    public List<ExpensesEntity> getAllExpenses();
    public List<ExpensesEntity> getAllBills();
    public void addItemToExpenses(ExpensesEntity ExpensesEntity);
    public void deleteItemInExpenses(ExpensesEntity ExpensesEntity);
    public void updateItemInExpenses(ExpensesEntity ExpensesEntity);
    public double getTotalAccout();
    public double getTotalBills();
    public double getTotalBillsUnpaid();

}
