package it.kineton.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "event")
public class Event {
	
	private Long id;
	private boolean prenotato;
	private User organizzatore;
	private SportsCenter campo;
	private String nome_prenotazione;
	private Date orario=new Date();
	@Column(nullable=false)
	@Type(type="yes_no")
	private boolean eliminato=Boolean.FALSE;
	private List<User> partecipanti=new ArrayList<User>();
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isPrenotato() {
		return prenotato;
	}
	public void setPrenotato(boolean prenotato) {
		this.prenotato = prenotato;
	}
	@ManyToOne
	public SportsCenter getCampo() {
		return campo;
	}
	public void setCampo(SportsCenter campo) {
		this.campo = campo;
	}
	public String getNome_prenotazione() {
		return nome_prenotazione;
	}
	public void setNome_prenotazione(String nome_prenotazione) {
		this.nome_prenotazione = nome_prenotazione;
	}
	public Date getOrario() {
		return orario;
	}
	public void setOrario(Date orario) {
		this.orario = orario;
	}
	public boolean isEliminato() {
		return eliminato;
	}
	public void setEliminato(boolean eliminato) {
		this.eliminato = eliminato;
	}
	
	@ManyToOne 
	public User getOrganizzatore() {
		return organizzatore;
	}
	public void setOrganizzatore(User organizzatore) {
		this.organizzatore = organizzatore;
	}
	@ManyToMany
	@JoinTable(name="event_user",joinColumns={@JoinColumn(name="event_id")},inverseJoinColumns={@JoinColumn(name="user_id")})
	public List<User> getPartecipanti() {
		return partecipanti;
	}
	public void setPartecipanti(List<User> partecipanti) {
		this.partecipanti = partecipanti;
	}
	
	

}
