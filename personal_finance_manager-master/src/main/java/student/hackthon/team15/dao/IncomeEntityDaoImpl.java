package student.hackthon.team15.dao;

import org.springframework.stereotype.Repository;
import student.hackthon.team15.entity.IncomeEntity;

import java.util.List;

@Repository
public class IncomeEntityDaoImpl implements IncomeEntityDao{
    @Override
    public List<IncomeEntity> getAllIncome() {
        return null;
    }

    @Override
    public void addItemToIncome(IncomeEntity IncomeEntity) {

    }

    @Override
    public void deleteItemInIncome(IncomeEntity IncomeEntity) {

    }

    @Override
    public void updateItemInIncome(IncomeEntity IncomeEntity) {

    }

    @Override
    public double getTotalIncome() {
        return 0;
    }
}
