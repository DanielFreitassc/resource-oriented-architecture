package com.danielfreitassc.backend.services;

import java.util.concurrent.atomic.AtomicLong;

public class GeneratorId {
    private static final AtomicLong sequencial = new AtomicLong(1L);

    public static Long newId() {
        return sequencial.getAndIncrement();
    }
}
