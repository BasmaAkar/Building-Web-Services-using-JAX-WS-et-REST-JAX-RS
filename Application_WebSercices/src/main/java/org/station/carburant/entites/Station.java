package org.station.carburant.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Station")
public class Station  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
private int  id_station ;
private String nom ;
private String ville;
private String adresse ;
public int getId_station() {
	return id_station;
}

public Station(int id_station, String nom, String ville, String adresse) {
	super();
	this.id_station = id_station;
	this.nom = nom;
	this.ville = ville;
	this.adresse = adresse;
}

public Station() {
	super();
	
}

@ManyToMany
@JoinTable(name = "Station_Carburant",
joinColumns =  @JoinColumn(name = "id_station", referencedColumnName = "id_station" ),
inverseJoinColumns =@JoinColumn(name = "carburant_id", referencedColumnName = "id_carburant"))
private Collection<Carburant> Carburant= new ArrayList<>();


@OneToMany(mappedBy = "station")
private HistoCarburant HC ;


public void setId_station(int id_station) {
	this.id_station = id_station;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public Collection<Carburant> getCarburant() {
	return Carburant;
}

public void setCarburant(Collection<Carburant> carburant) {
	Carburant = carburant;
}




	
}
