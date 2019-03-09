package com.test.cinte.technicalassesment.models.dto;

import java.util.ArrayList;

public class CardDTO {

    private ArrayList<String> cardNumber;
    private String cvv;
    private String kindCard;
    private ConsumptionDTO consumtion;
    private Long idCard;

    public CardDTO() {
    }

    public Long getIdCard() {
        return idCard;
    }

    public void setIdCard(Long idCard) {
        this.idCard = idCard;
    }

    public ArrayList<String> getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(ArrayList<String> cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getKindCard() {
        return kindCard;
    }

    public void setKindCard(String kindCard) {
        this.kindCard = kindCard;
    }

    public ConsumptionDTO getConsumtion() {
        return consumtion;
    }

    public void setConsumtion(ConsumptionDTO consumtion) {
        this.consumtion = consumtion;
    }

    @Override
    public String toString() {
        return "CardDTO{" +
                "cardNumber=" + cardNumber +
                ", cvv='" + cvv + '\'' +
                ", kindCard='" + kindCard + '\'' +
                ", consumtion=" + consumtion +
                '}';
    }
}
