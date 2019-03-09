package com.test.cinte.technicalassesment.models.dao;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "client_table")
public class ClientDAO {
    @Id
    @GeneratedValue()
    @Column(name = "client_id")
    private Long id_client;
    @Column(length = 50)
    private String name;
    @Column(length = 100)
    private String address;
    @Column(length = 30)
    private String city;
    @Column(length = 20)
    private Long phone;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="client_id", referencedColumnName = "client_id")
    private List<CardDAO> cardList= new ArrayList<>();

    public ClientDAO (){}

    public Long getId() {
        return id_client;
    }

    public void setId(Long id) {
        this.id_client = id;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Long getPhone() {
        return phone;
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

    public List<CardDAO> getCardList() {
        return cardList;
    }

    public void setCardList(List<CardDAO> cardList) {
        this.cardList = cardList;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id_client +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", phone=" + phone +
                ", cardList=" + cardList +
                '}';
    }
}
