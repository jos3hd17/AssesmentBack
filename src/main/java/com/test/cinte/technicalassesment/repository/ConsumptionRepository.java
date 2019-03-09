package com.test.cinte.technicalassesment.repository;

import com.test.cinte.technicalassesment.models.dao.CardDAO;
import com.test.cinte.technicalassesment.models.dao.ConsumptionDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;

public interface ConsumptionRepository extends JpaRepository<ConsumptionDAO, Long> {
    @Query( value = "update consumption_table consumption set consumption.consumption_date = 2? , consumption.description = 3?, consumption.ammount = 4?  where consumption.card_id = 1? ", nativeQuery = true)
    ConsumptionDAO updateConsumptions(Long idCard, Date consumptionDate, String description, Integer ammount);
}
