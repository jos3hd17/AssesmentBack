package com.test.cinte.technicalassesment.models.dto;

import java.util.ArrayList;

public class ClientDTO {

    private String name;
    private String address;
    private String city;
    private Long phone;
    private ArrayList<CardDTO> cardList;

    public ClientDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public ArrayList<CardDTO> getCardList() {
        return cardList;
    }

    public void setCardList(ArrayList<CardDTO> cardList) {
        this.cardList = cardList;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", phone=" + phone +
                ", cardList=" + cardList +
                '}';
    }
}
