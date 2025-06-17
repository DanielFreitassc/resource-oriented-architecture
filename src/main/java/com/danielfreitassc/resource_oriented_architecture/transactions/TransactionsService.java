package com.danielfreitassc.resource_oriented_architecture.transactions;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransactionsService {
    private final TransactionsRepository transactionsRepository;
    private final TransactionsMapper transactionsMapper;

    public TransactionsResponseDto create(TransactionsRequestDto transactionsRequestDto) {
        return transactionsMapper.toDto(transactionsRepository.save(transactionsMapper.toEntity(transactionsRequestDto)));
    }

    public Page<TransactionsResponseDto> getTransactions(Pageable pageable) {
        return transactionsRepository.findAll(pageable).map(transactionsMapper::toDto);
    } 

    public TransactionsResponseDto getTransaction(UUID id) {
        return transactionsMapper.toDto(findTransactionsOrThrow(id));
    }

    public TransactionsResponseDto update(UUID id, TransactionsRequestDto transactionsRequestDto) {
        TransactionsEntity transactionsEntity = findTransactionsOrThrow(id);
        
        transactionsMapper.toUpdate(transactionsRequestDto, transactionsEntity);

        return transactionsMapper.toDto(transactionsRepository.save(transactionsEntity));
    }

    public TransactionsResponseDto delete(UUID id) {
        TransactionsEntity transactionsEntity = findTransactionsOrThrow(id);
        transactionsRepository.delete(transactionsEntity);
        
        return transactionsMapper.toDto(transactionsEntity);
    }

    private TransactionsEntity findTransactionsOrThrow(UUID id) {
        Optional<TransactionsEntity> transaction = transactionsRepository.findById(id);
        if(transaction.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Movimentação não encontrada");
        return transaction.get();
    }
}
