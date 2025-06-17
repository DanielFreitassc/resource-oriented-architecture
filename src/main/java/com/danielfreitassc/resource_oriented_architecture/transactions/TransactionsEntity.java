package com.danielfreitassc.resource_oriented_architecture.transactions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import com.danielfreitassc.resource_oriented_architecture.balance.BalanceEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transactions")
@Entity(name = "transactions")
public class TransactionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String description;
    @ManyToOne
    @JoinColumn(name = "balance")
    private BalanceEntity balance;
    @Enumerated(EnumType.STRING)
    private TransactionsEnum transactionType;
    private LocalDate transactionDate;
    private LocalDate dueDate;
    @CreationTimestamp
    private LocalDateTime createdAt;
}
