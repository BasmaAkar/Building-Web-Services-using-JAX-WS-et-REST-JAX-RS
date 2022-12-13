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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Carburant")
public class Carburant implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_carburant;
	private String nom_carburant;
	private String description;

	public Carburant(Long id_carburant, String nom_carburant, String description) {
		super();
		this.id_carburant = id_carburant;
		this.nom_carburant = nom_carburant;
		this.description = description;
	}

	public Carburant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@OneToMany(orphanRemoval = true, cascade = CascadeType.PERSIST, mappedBy = "carburant")
	private HistoCarburant HC ; 
	
	public Long getId_carburant() {
		return id_carburant;
	}

	public void setId_carburant(Long id_carburant) {
		this.id_carburant = id_carburant;
	}

	public String getNom_carburant() {
		return nom_carburant;
	}

	public void setNom_carburant(String nom_carburant) {
		this.nom_carburant = nom_carburant;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Station [id_carburant=" + id_carburant + ", nom_carburant=" + nom_carburant + ", description="
				+ description + "]";
	}

}
