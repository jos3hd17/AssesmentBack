package com.test.cinte.technicalassesment.repository;

import com.test.cinte.technicalassesment.models.dao.ClientDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ClientJpaRepository extends JpaRepository<ClientDAO, Long> {
    ClientDAO findByName(String name);
}
