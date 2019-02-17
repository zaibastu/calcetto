package it.kineton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.kineton.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
