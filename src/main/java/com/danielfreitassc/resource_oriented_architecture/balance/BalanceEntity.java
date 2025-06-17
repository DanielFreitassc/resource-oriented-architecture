package com.danielfreitassc.resource_oriented_architecture.balance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "balance")
@Entity(name = "balance")
public class BalanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private BigDecimal amount;
    @CreationTimestamp
    private LocalDate updatedAt;
    @CreationTimestamp
    private LocalDate createdAt;
}
