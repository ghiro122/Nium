package com.niumTask.nium.service.ServiceImpl;

import com.niumTask.nium.dto.CardCreateDTO;
import com.niumTask.nium.entity.Card;
import com.niumTask.nium.repository.CardRepo;
import com.niumTask.nium.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

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


    @Override
    public Card spendFromCard(UUID cardId, BigDecimal amount) {
        Card card = cardRepo.findById(cardId)
                .orElseThrow(() -> new RuntimeException("Card not found"));

        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("Amount must be positive");
        }

        if (amount.compareTo(card.getBalance()) > 0) {
            throw new RuntimeException("Insufficient balance");
        }

        card.setBalance(card.getBalance().subtract(amount));
        return cardRepo.save(card);
    }

    @Override
    public Optional<Card> findById(UUID cardId) {
        return cardRepo.findById(cardId);
    }


}
