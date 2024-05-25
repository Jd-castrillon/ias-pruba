package com.ias.eventos.domain.usecase;

import com.ias.eventos.domain.model.Events.Event;
import com.ias.eventos.domain.model.Events.gateway.CreateEvent;
import com.ias.eventos.domain.model.Events.gateway.RetrieveEvents;

import java.util.List;

public class EventIUseCase {

    private final CreateEvent createEvent;

    private final RetrieveEvents retrieveEvents;

    public EventIUseCase(CreateEvent createEvent, RetrieveEvents retrieveEvents) {
        this.createEvent = createEvent;
        this.retrieveEvents = retrieveEvents;
    }

    public Event getEventById(String id) {
        return retrieveEvents.getEvent(id);
    }

    public List<Event> getAllEvents(){
        return  retrieveEvents.getAllEvent();
    }

    public void createEvent(Event event){
        createEvent.createEvent(event);
    }
}
