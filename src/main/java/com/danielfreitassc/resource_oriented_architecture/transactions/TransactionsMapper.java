package com.danielfreitassc.resource_oriented_architecture.transactions;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface TransactionsMapper {
    TransactionsResponseDto toDto(TransactionsEntity transactionsEntity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "balance.id", source = "balanceId")
    TransactionsEntity toEntity(TransactionsRequestDto transactionsRequestDto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "balance.id", source = "balanceId")
    void toUpdate(TransactionsRequestDto transactionsRequestDto, @MappingTarget TransactionsEntity transactionsEntity);
}
