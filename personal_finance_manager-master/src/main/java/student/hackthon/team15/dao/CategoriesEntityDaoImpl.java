package student.hackthon.team15.dao;

import org.springframework.stereotype.Repository;
import student.hackthon.team15.entity.CategoriesEntity;

import java.util.List;

@Repository
public class CategoriesEntityDaoImpl implements CategoriesEntityDao{
    @Override
    public List<CategoriesEntity> getAllCategories() {
        return null;
    }

    @Override
    public void addItemToCategories(CategoriesEntity categoriesEntity) {

    }

    @Override
    public void deleteItemInCategories(int id) {

    }

    @Override
    public void updateItemInCategories(CategoriesEntity categoriesEntity) {

    }

    @Override
    public boolean ifCategoryContainsId(int id) {
        return false;
    }
}
