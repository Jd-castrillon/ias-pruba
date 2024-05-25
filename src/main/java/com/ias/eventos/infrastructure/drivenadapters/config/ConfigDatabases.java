package com.ias.eventos.infrastructure.drivenadapters.config;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConfigDatabases {

    private static final EntityManagerFactory entityManagerFactory;

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("bd-events-ias");
    }

    public static EntityManager getEntityManagerFactory() {
        return  entityManagerFactory.createEntityManager();
    }
}
