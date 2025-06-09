package com.niumTask.nium.service;

import com.niumTask.nium.dto.CardCreateDTO;
import com.niumTask.nium.entity.Card;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

public interface CardService {
    public Card createCard(CardCreateDTO cardDTO);

    public Card spendFromCard(UUID cardId, BigDecimal amount);

    public Optional<Card> findById(UUID cardId);


}
