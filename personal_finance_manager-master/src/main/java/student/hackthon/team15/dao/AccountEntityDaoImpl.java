package student.hackthon.team15.dao;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import student.hackthon.team15.entity.AccountEntity;

import org.slf4j.Logger;
import org.springframework.data.mongodb.core.query.Query;
import student.hackthon.team15.entity.BudgetEntity;

import java.util.List;

@Repository
public class AccountEntityDaoImpl implements AccountEntityDao {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(AccountEntityDaoImpl.class);
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public double getAccountValue(){
        List<AccountEntity> acc = mongoTemplate.findAll(AccountEntity.class);
        return acc.get(0).getValue();
    }
    @Override
    public double updateAccount(double value) {
        List<BudgetEntity> budgetEntities = mongoTemplate.findAll(BudgetEntity.class);
        String id = budgetEntities.get(0).getId();
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("value",value);
        mongoTemplate.updateFirst(query,update,AccountEntity.class);
        return 0;
    }

}
