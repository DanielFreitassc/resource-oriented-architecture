package com.danielfreitassc.resource_oriented_architecture.balance;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BalanceMapper {
    BalanceResponseDto toDto(BalanceEntity balanceEntity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    BalanceEntity toEntity(BalanceRequestDto balanceRequestDto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    void toUpdate(BalanceRequestDto balanceRequestDto, @MappingTarget BalanceEntity balanceEntity);
}
