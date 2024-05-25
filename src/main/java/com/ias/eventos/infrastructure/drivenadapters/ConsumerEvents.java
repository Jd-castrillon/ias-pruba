package com.ias.eventos.infrastructure.drivenadapters;

import com.ias.eventos.domain.model.Events.Event;
import com.ias.eventos.domain.model.Events.gateway.CreateEvent;
import com.ias.eventos.domain.model.Events.gateway.RetrieveEvents;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class ConsumerEvents implements CreateEvent , RetrieveEvents {

    private final EntityManagerFactory entityManagerFactory;

    public ConsumerEvents(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public Event createEvent(Event event) {
        return entityManagerFactory.;
    }

    @Override
    public List<Event> getAllEvent() {
        return null;
    }

    @Override
    public Event getEvent(String id) {
        return null;
    }
}
