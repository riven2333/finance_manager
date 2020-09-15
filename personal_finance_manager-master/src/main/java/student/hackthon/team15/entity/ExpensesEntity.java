package student.hackthon.team15.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection="expenses")
public class ExpensesEntity {
    @Id
    private int id;
    private int categoryName;
    private double value;
    private String date;
    private Boolean billType;
    private Boolean billPaid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(int categoryName) {
        this.categoryName = categoryName;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getBillType() {
        return billType;
    }

    public void setBillType(Boolean billType) {
        this.billType = billType;
    }

    public Boolean getBillPaid() {
        return billPaid;
    }

    public void setBillPaid(Boolean billPaid) {
        this.billPaid = billPaid;
    }
}
