package it.kineton.service;

import it.kineton.model.Event;
import it.kineton.model.SportsCenter;
import it.kineton.model.User;
import it.kineton.repository.EventRepository;
import it.kineton.repository.RoleRepository;
import it.kineton.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
	@Override
	public void updateUser(Long id, User utente) {
		userRepository.save(utente);
	
	}

	public void deleteUser(Long id) {
		userRepository.delete(id);
		
	}
	
	
	
	
}
