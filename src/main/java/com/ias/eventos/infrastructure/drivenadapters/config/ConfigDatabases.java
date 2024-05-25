package com.ias.eventos.infrastructure.drivenadapters.config;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

;

public class ConfigDatabases {

    private static final EntityManagerFactory entityManagerFactory;

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("bd-events-ias");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return (EntityManagerFactory) entityManagerFactory.createEntityManager();
    }
}
