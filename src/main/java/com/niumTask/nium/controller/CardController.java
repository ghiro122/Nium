package com.niumTask.nium.controller;

import com.niumTask.nium.dto.CardCreateDTO;
import com.niumTask.nium.entity.Card;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cards")
public class CardController {

    @PostMapping
    public Card createCard(@RequestBody CardCreateDTO cardCreateDTO){

    }
}
