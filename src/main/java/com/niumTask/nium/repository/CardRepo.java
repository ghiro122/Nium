package com.niumTask.nium.repository;

import com.niumTask.nium.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CardRepo extends JpaRepository<Card, UUID> {

}
