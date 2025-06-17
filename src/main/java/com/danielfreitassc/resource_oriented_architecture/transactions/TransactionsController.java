package com.danielfreitassc.resource_oriented_architecture.transactions;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/transactions")
public class TransactionsController {
    private final TransactionsService transactionsService;

    @PostMapping
    public TransactionsResponseDto create(@RequestBody @Valid TransactionsRequestDto transactionsRequestDto) {
        return transactionsService.create(transactionsRequestDto);
    }

    @GetMapping
    public Page<TransactionsResponseDto> getTransactions(Pageable pageable) {
        return transactionsService.getTransactions(pageable);
    }

    @GetMapping("/{id}")
    public TransactionsResponseDto getTransaction(@PathVariable UUID id) {
        return transactionsService.getTransaction(id);
    }

    @PutMapping("/{id}")
    public TransactionsResponseDto update(@PathVariable UUID id,@RequestBody @Valid TransactionsRequestDto transactionsRequestDto) {
        return transactionsService.update(id, transactionsRequestDto);
    }

    @DeleteMapping("/{id}")
    public TransactionsResponseDto delete(@PathVariable UUID id) {
        return transactionsService.delete(id);
    }
}
