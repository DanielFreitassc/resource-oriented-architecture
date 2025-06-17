package com.danielfreitassc.resource_oriented_architecture.transactions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import com.danielfreitassc.resource_oriented_architecture.balance.BalanceResponseDto;
import com.fasterxml.jackson.annotation.JsonFormat;

public record TransactionsResponseDto(
    UUID id,
    String description,
    BalanceResponseDto balance,
    TransactionsEnum transactionType,
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate transactionDate,
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dueDate,
    @CreationTimestamp
    LocalDateTime createdAt
) {
    
}
