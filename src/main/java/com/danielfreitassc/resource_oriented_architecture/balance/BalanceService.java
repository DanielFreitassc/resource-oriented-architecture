package com.danielfreitassc.resource_oriented_architecture.balance;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BalanceService {
    private final BalanceRepository balanceRepository;
    private final BalanceMapper balanceMapper;

    public BalanceResponseDto create(BalanceRequestDto balanceRequestDto) {
        return balanceMapper.toDto(balanceRepository.save(balanceMapper.toEntity(balanceRequestDto)));
    }
}
