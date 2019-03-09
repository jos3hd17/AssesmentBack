package com.test.cinte.technicalassesment.controllers;

import com.test.cinte.technicalassesment.models.dao.CardDAO;
import com.test.cinte.technicalassesment.models.dao.ClientDAO;
import com.test.cinte.technicalassesment.repository.CardsJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/card")
public class CardsController {

    @Autowired
    private CardsJpaRepository cardsJpaRepository;

    @GetMapping(value = "/{idCard}")
    public CardDAO getCardInfo(@PathVariable final Long idCard){
        return cardsJpaRepository.findByCode(idCard);
    }


}
