package com.danielfreitassc.resource_oriented_architecture.transactions;

import java.time.LocalDate;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

public record TransactionsRequestDto(
    String description,
    UUID balanceId,
    TransactionsEnum transactionType,
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate transactionDate,
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dueDate
) {
    
}
