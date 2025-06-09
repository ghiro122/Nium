package com.niumTask.nium.controller;

import com.niumTask.nium.dto.CardCreateDTO;
import com.niumTask.nium.dto.CardDetailDTO;
import com.niumTask.nium.dto.CardTransactionDTO;
import com.niumTask.nium.entity.Card;
import com.niumTask.nium.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/cards")
public class CardController {

    @Autowired
    private CardService cardService;


    @PostMapping
    public Card createCard(@RequestBody CardCreateDTO cardCreateDTO) {
        return cardService.createCard(cardCreateDTO);
    }

    @PostMapping("{id}/spend")
    public Card spendFromCard(@PathVariable UUID id, @RequestBody CardTransactionDTO transactionDTO) {
        return cardService.spendFromCard(id, transactionDTO.getAmount());
    }

    @GetMapping("/{id}")
    public CardDetailDTO getCard(@PathVariable("id") UUID cardId) {
        Card card = cardService.findById(cardId)
                .orElseThrow(() -> new RuntimeException("Card not found with id: " + cardId));

        return new CardDetailDTO(
                card.getId(),
                card.getCardholderName(),
                card.getBalance(),
                card.getCreatedAt()
        );

    }


}
