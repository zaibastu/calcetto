package it.kineton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.kineton.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
	
	

}
