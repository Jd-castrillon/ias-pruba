package com.ias.eventos.infrastructure.drivenadapters;

import com.ias.eventos.domain.model.Events.Event;
import com.ias.eventos.domain.model.Events.gateway.CreateEvent;
import com.ias.eventos.domain.model.Events.gateway.RetrieveEvents;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class ConsumerEvents implements CreateEvent , RetrieveEvents {

    @PersistenceContext
    private final EntityManager entityManager;

    public ConsumerEvents(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void createEvent(Event event) {
        entityManager.persist(event);
    }

    @Override
    public List<Event> getAllEvent() {
        return entityManager.createQuery("Select e FROM events e")
                .getResultList();
    }

    @Override
    public Event getEvent(String id) {
        return entityManager.find(Event.class,id);
    }
}
