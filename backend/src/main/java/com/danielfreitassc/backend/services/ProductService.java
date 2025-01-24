package com.danielfreitassc.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.danielfreitassc.backend.dtos.ProductRequestDto;
import com.danielfreitassc.backend.dtos.ProductResponseDto;
import com.danielfreitassc.backend.mappers.ProductMapper;
import com.danielfreitassc.backend.models.ProductEntity;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductMapper productMapper;
    private final List<ProductEntity> products;

    public ProductResponseDto create(ProductRequestDto productRequestDto) {
        ProductEntity productEntity = productMapper.toEntity(productRequestDto);
        productEntity.setId(GeneratorId.newId());
        products.add(productEntity);
        return productMapper.toDto(productEntity);
    }

    public List<ProductResponseDto> getAll() {
        return products.stream().map(productMapper::toDto).toList();
    }

    public ProductResponseDto getById(Long id) {
        Optional<ProductEntity> product = products.stream().filter(prod -> prod.getId().equals(id)).findFirst();
        if(product.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum produto econtrado");
        return  productMapper.toDto(product.get());
    }

    public ProductResponseDto update(Long id, ProductRequestDto productRequestDto) {
        Optional<ProductEntity> product = products.stream().filter(prod -> prod.getId().equals(id)).findFirst();
        if(product.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum produto encontrado");
        ProductEntity productEntity = productMapper.toEntity(productRequestDto);
        productEntity.setId(id);
        products.remove(product.get());
        products.add(productEntity);
        return productMapper.toDto(productEntity);
    }

    public ProductResponseDto delete(Long id) {
        Optional<ProductEntity> product = products.stream().filter(prod -> prod.getId().equals(id)).findFirst();
        if(product.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum produto encontrado");
        products.remove(product.get());
        return productMapper.toDto(product.get());
    }
}
