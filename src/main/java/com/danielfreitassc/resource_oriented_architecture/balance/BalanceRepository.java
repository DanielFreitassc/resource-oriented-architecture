package com.danielfreitassc.resource_oriented_architecture.balance;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceRepository extends JpaRepository<BalanceEntity, UUID> {
    
}
