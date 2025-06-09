package com.niumTask.nium.entity;

import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
public class Card {

    UUID id;
    String cardholderName;
    BigDecimal balance;
    Timestamp createdAt;

}

