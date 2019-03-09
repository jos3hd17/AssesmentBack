package com.test.cinte.technicalassesment.transformers;

import com.test.cinte.technicalassesment.models.dao.CardDAO;
import com.test.cinte.technicalassesment.models.dao.ClientDAO;
import com.test.cinte.technicalassesment.models.dto.CardDTO;
import com.test.cinte.technicalassesment.models.dto.ClientDTO;

import java.util.ArrayList;

public class ClientTransformer {

 public ClientDTO clientDAOtoDTO(ClientDAO clientDAO) {
     ClientDTO clientDTO = new ClientDTO();
     clientDTO.setName(clientDAO.getName());
     clientDTO.setAddress(clientDAO.getName());
     clientDTO.setCity(clientDAO.getCity());
     clientDAO.setPhone(clientDAO.getPhone());
     ArrayList<CardDTO> cardList =  new ArrayList<>();
     for(CardDAO card: clientDAO.getCardList()){
         CardDTO cardInfo = new CardDTO();
         cardInfo.setCardNumber(card.getCardNumbers());
         cardInfo.setCvv(card.getCvv());
         cardInfo.setKindCard(card.getKindCard());
         cardInfo.setIdCard(card.getIdCard());
         cardList.add(cardInfo);
     }
     clientDTO.setCardList(cardList);
     return clientDTO;
 }

}
