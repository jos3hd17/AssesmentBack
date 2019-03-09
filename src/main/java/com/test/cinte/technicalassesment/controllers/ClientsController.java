package com.test.cinte.technicalassesment.controllers;

import com.test.cinte.technicalassesment.models.dao.ClientDAO;
import com.test.cinte.technicalassesment.models.dto.ClientDTO;
import com.test.cinte.technicalassesment.repository.ClientJpaRepository;
import com.test.cinte.technicalassesment.transformers.ClientTransformer;
import org.jooq.tools.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientsController {

    @Autowired
    private ClientJpaRepository clientJpaRepository;

    @GetMapping(value = "/all")
    public List<ClientDTO> allClients(){
        ClientTransformer transformer = new ClientTransformer();
        List<ClientDTO> clientList = new ArrayList<>();
        for (ClientDAO client : clientJpaRepository.findAll()) {
                ClientDTO clientObj = new ClientDTO();
                clientObj = transformer.clientDAOtoDTO(client);
                clientList.add(clientObj);
        }
        return clientList;
    }
    @GetMapping(value = "/{name}")
    public ClientDAO getClient(@PathVariable final String name) {

        return clientJpaRepository.findByName(name);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ClientDAO saveClient(@RequestBody final ClientDAO client){
        clientJpaRepository.save(client);
        return clientJpaRepository.findByName(client.getName());
    }



}
