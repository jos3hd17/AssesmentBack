package com.test.cinte.technicalassesment.models.dao;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "card_table")
public class CardDAO{
    @GeneratedValue()
    @Id
    @Column(name = "card_id")
    private Long idCard;
    @Column()
    private ArrayList<String> cardNumbers = new ArrayList<>(4);
    @Column()
    private String cvv;
    @Column()
    private String kindCard;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_id", referencedColumnName = "card_id")
    private List<ConsumptionDAO> consumption = new ArrayList<>();

    private Long client_id;

    public CardDAO (){}

    public Long getClient() {
        return client_id;
    }

    public void setClient(Long client) {
        this.client_id = client;
    }

    public void setConsumption(List<ConsumptionDAO> consumption) {
        this.consumption = consumption;
    }

    public List<ConsumptionDAO> getConsumption() {
        return consumption;
    }

    public String getKindCard() {
        return kindCard;
    }

    public void setKindCard(String kindCard) {
        this.kindCard = kindCard;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public ArrayList<String> getCardNumbers() {
        return cardNumbers;
    }

    public void setCardNumbers(ArrayList<String> cardNumbers) {
        this.cardNumbers = cardNumbers;
    }

    public Long getIdCard() {
        return idCard;
    }

    public void setIdCard(Long idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumbers=" + cardNumbers +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
