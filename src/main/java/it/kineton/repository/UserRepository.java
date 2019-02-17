package it.kineton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.kineton.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
