package student.hackthon.team15.dao;

import org.springframework.stereotype.Repository;
import student.hackthon.team15.entity.ExpensesEntity;

import java.util.List;

@Repository
public class ExpensesEntityDaoImpl implements ExpensesEntityDao{
    @Override
    public List<ExpensesEntity> getAllExpenses() {
        return null;
    }

    @Override
    public List<ExpensesEntity> getAllBills() {
        return null;
    }

    @Override
    public void addItemToExpenses(ExpensesEntity ExpensesEntity) {

    }

    @Override
    public void deleteItemInExpenses(ExpensesEntity ExpensesEntity) {

    }

    @Override
    public void updateItemInExpenses(ExpensesEntity ExpensesEntity) {

    }

    @Override
    public double getTotalAccout() {
        return 0;
    }

    @Override
    public double getTotalBills() {
        return 0;
    }

    @Override
    public double getTotalBillsUnpaid() {
        return 0;
    }
}
