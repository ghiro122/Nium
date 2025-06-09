package com.niumTask.nium.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

public class CardDetailDTO {

    UUID id;
    String cardholderName;
    BigDecimal balance;

    Timestamp createdAt;

    public CardDetailDTO(UUID id, String cardholderName, BigDecimal balance, Timestamp createdAt) {
        this.id = id;
        this.cardholderName = cardholderName;
        this.balance = balance;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
