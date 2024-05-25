package com.ias.eventos.domain.model.Events.gateway;

import com.ias.eventos.domain.model.Events.Event;

import java.util.List;

public interface RetrieveEvents {

    List<Event> getAllEvent();

    Event getEvent(String id);

}
