package com.danielfreitassc.resource_oriented_architecture.transactions;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<TransactionsEntity, UUID> {
    
}
