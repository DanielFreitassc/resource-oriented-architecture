package com.danielfreitassc.resource_oriented_architecture.transactions;

public enum TransactionsEnum {
    INCOME("Renda"),
    EXPENSE("Despesa");

    private final String label;

    TransactionsEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
}
