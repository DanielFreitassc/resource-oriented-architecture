package com.danielfreitassc.resource_oriented_architecture.balance;

import java.math.BigDecimal;

public record BalanceRequestDto(
    BigDecimal amount
) {
    
}
