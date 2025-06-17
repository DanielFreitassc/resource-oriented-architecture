package com.danielfreitassc.resource_oriented_architecture.balance;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record BalanceResponseDto(
    UUID id,
    BigDecimal amount,
    LocalDateTime updatedAt,
    LocalDateTime createdAt
) {
    
}
