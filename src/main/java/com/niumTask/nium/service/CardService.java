package com.niumTask.nium.service;

import com.niumTask.nium.dto.CardCreateDTO;
import com.niumTask.nium.entity.Card;

public interface CardService {
    public Card createCard(CardCreateDTO cardDTO);
}
