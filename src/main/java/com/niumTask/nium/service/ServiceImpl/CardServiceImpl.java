package com.niumTask.nium.service.ServiceImpl;

import com.niumTask.nium.dto.CardCreateDTO;
import com.niumTask.nium.entity.Card;
import com.niumTask.nium.repository.CardRepo;
import com.niumTask.nium.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepo cardRepo;


    public Card createCard(CardCreateDTO cardDTO) {
        Card card = new Card();

        card.setCreatedAt(Timestamp.from(Instant.now()));
        card.setCardholderName(cardDTO.getCardholderName());
        card.setBalance(cardDTO.getInitialBalance());

        return cardRepo.save(card);
    }

}
