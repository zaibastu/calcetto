package it.kineton.model;


import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import lombok.*;


@Entity
@Table(name = "centro_sportivo")
public class SportsCenter {
	
	private Long id;
	private String nome_centro;
	private String indirizzo_centro;
	private String numero_telefono;
	
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome_centro() {
		return nome_centro;
	}
	public void setNome_centro(String nome_centro) {
		this.nome_centro = nome_centro;
	}
	public String getIndirizzo_centro() {
		return indirizzo_centro;
	}
	public void setIndirizzo_centro(String indirizzo_centro) {
		this.indirizzo_centro = indirizzo_centro;
	}
	public String getNumero_telefono() {
		return numero_telefono;
	}
	public void setNumero_telefono(String numero_telefono) {
		this.numero_telefono = numero_telefono;
	}
	
	

}
