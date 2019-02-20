package it.kineton.service;

import java.util.Date;
import java.util.List;

import it.kineton.model.Event;
import it.kineton.model.SportsCenter;
import it.kineton.model.User;

public interface EventService {

	public void create (User user, Date data_match,SportsCenter sportsCenter,boolean prenotato);
	public void partecipate (Event event,User user);
	public List<Event> find();
	public void delete(Event event,User user);
	
	
}
