package it.kineton.web;

import it.kineton.model.Event;
import it.kineton.model.SportsCenter;
import it.kineton.model.User;
import it.kineton.service.EventService;
import it.kineton.service.UserService;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {
	
	
	@Autowired
	private EventService eventService;
	
	@RequestMapping(value = "/event", method = RequestMethod.GET)
	public List<Event> find (){
		 return eventService.find();
	}
	
	@RequestMapping(value = "/event", method = RequestMethod.PUT)
	public void create (@RequestBody User user, Date data_match,@RequestBody SportsCenter sportsCenter,boolean prenotato) {
		eventService.create ( user,data_match,sportsCenter, prenotato);
		
	}
	@RequestMapping(value = "/event{id}", method = RequestMethod.POST)
	public void partecipate (@RequestBody Event event, @RequestBody User user) {
		eventService.partecipate(event,user);
	}
	
	@RequestMapping(value = "/event/{id}", method = RequestMethod.DELETE)
	public void delete(@RequestBody Event event, @RequestBody User user) {
		eventService.delete(event,user);
	}
	
	
	
	

}
