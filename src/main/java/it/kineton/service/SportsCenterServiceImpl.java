package it.kineton.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.kineton.model.SportsCenter;
import it.kineton.repository.SportsCenterRepository;

@Service
public class SportsCenterServiceImpl implements SportsCenterService {
	
	@Autowired
	SportsCenterRepository sportsCenterRepository;

	public void create (String nome_centro,String indirizzo,String numero_telefono) {
		SportsCenter sportCenter = new SportsCenter();
		sportCenter.setNome_centro(nome_centro);
		sportCenter.setIndirizzo_centro(indirizzo);
		sportCenter.setNumero_telefono(numero_telefono);
		sportsCenterRepository.save(sportCenter);
		
	}
	
	public void delete (SportsCenter sportCenter) {
		sportsCenterRepository.delete(sportCenter);
	}
	
	
	
}
