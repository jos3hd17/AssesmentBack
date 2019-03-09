package com.test.cinte.technicalassesment.controllers;

import com.test.cinte.technicalassesment.models.dao.CardDAO;
import com.test.cinte.technicalassesment.models.dao.ConsumptionDAO;
import com.test.cinte.technicalassesment.repository.CardsJpaRepository;
import com.test.cinte.technicalassesment.repository.ConsumptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/consumption")
public class ConsumptionController {

    @Autowired
    ConsumptionRepository consumptionRepository;
    @Autowired
    CardsJpaRepository cardsJpaRepository;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public CardDAO setCardInfo(@RequestBody final CardDAO cardDAO){
        for(ConsumptionDAO consumption: cardDAO.getConsumption()){
            consumptionRepository.save(consumption);
            consumptionRepository.updateConsumptions(cardDAO.getIdCard(), consumption.getConsumptionDate(), consumption.getDescription(), consumption.getAmmount());
        }
        return cardsJpaRepository.findByCode(cardDAO.getIdCard());
    }

    @GetMapping(value = "/all")
    public List<ConsumptionDAO> getAll(){
        return consumptionRepository.findAll();
    }
}
