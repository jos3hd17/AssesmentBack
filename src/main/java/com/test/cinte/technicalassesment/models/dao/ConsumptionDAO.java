package com.test.cinte.technicalassesment.models.dao;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "consumption_table")
public class ConsumptionDAO {

    @Id
    @GeneratedValue()
    @Column(name = "consumption_id")
    private Long id_consumption;
    @Column(name= "consumption_date")
    @DateTimeFormat()
    private Date consumptionDate;
    @Column(length = 500, name = "description")
    private String description;
    @Column(length = 12, name = "ammount")
    private Integer ammount;
    @Column(name = "card_id")
    private Long card_id;


    public ConsumptionDAO() {
    }

    public Long getCardId() {
        return card_id;
    }

    public void setCardId(Long card_id) {
        this.card_id = card_id;
    }

    public Long getId() {
        return id_consumption;
    }

    public void setId(Long id) {
        this.id_consumption = id;
    }

    public Date getConsumptionDate() {
        return consumptionDate;
    }

    public void setConsumptionDate(Date consumptionDate) {
        this.consumptionDate = consumptionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }

    @Override
    public String toString() {
        return "Consumption{" +
                "id=" + id_consumption +
                ", consumptionDate=" + consumptionDate +
                ", description='" + description + '\'' +
                ", ammount=" + ammount +
                '}';
    }
}
