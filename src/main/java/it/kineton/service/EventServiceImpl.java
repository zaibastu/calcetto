package it.kineton.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.kineton.model.User;
import it.kineton.repository.EventRepository;
import it.kineton.model.Event;
import it.kineton.model.SportsCenter;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventRepository eventRepository;
	
	
public void create (User user, Date data_match,SportsCenter sportsCenter,boolean prenotato) {
		
		Event event = new Event();
		event.setOrganizzatore(user);
		event.setCampo(sportsCenter);
		event.setPrenotato(prenotato);
		eventRepository.save(event);
	}

public void partecipate (Event event,User user) {
		 List<User> partecipanti =  event.getPartecipanti();
		 if (partecipanti.size()==10)
		 {
			 System.out.println("Numero massimo di partecipanti");
		 }
		 else {
			 partecipanti.add(user);
			 event.setPartecipanti(partecipanti);
			 eventRepository.save(event);
		 }
	}
	 public void delete(Event event,User user) {
		 List<User> giocatori =  event.getPartecipanti();
		 	giocatori.remove(user);
		 	event.setPartecipanti(giocatori);
			 eventRepository.save(event);
		 
	 }
	
	 public List<Event> find (){
		return eventRepository.findAll();
	}
	 
	public void delete_event(Event event) {
		eventRepository.delete(event);
	}
	
	
	
}
