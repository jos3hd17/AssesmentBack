package com.test.cinte.technicalassesment.repository;

import com.test.cinte.technicalassesment.models.dao.CardDAO;

import com.test.cinte.technicalassesment.models.dto.ConsumptionDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;


@Component
public interface CardsJpaRepository extends JpaRepository<CardDAO, Long> {
    @Query(value = "SELECT * FROM card_table c WHERE c.card_id = ?1", nativeQuery = true)
    CardDAO findByCode( Long idCard );

}
