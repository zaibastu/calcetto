package it.kineton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.kineton.model.SportsCenter;

public interface SportsCenterRepository extends JpaRepository<SportsCenter, Long> {

}
