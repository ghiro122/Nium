package com.niumTask.nium.controller;

import com.niumTask.nium.dto.CardCreateDTO;
import com.niumTask.nium.entity.Card;
import com.niumTask.nium.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cards")
public class CardController {

    @Autowired
    private CardService cardService;


    @PostMapping
    public Card createCard(@RequestBody CardCreateDTO cardCreateDTO){
        return cardService.createCard(cardCreateDTO);
    }


}
