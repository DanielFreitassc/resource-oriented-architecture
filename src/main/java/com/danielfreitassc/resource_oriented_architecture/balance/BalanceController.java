package com.danielfreitassc.resource_oriented_architecture.balance;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/balances")
public class BalanceController {
    private final BalanceService balanceService;

    @PostMapping
    public BalanceResponseDto create(@RequestBody @Valid BalanceRequestDto balanceRequestDto) {
        return balanceService.create(balanceRequestDto);
    }
}
