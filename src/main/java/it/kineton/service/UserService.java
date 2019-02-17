package it.kineton.service;

import it.kineton.model.User;

public interface UserService {
    
	void save(User user);
	User findByUsername(String username);
	void updateUser(Long id, User utente);
	public void deleteUser(Long id);
    
    
    
    
}
