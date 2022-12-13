package org.station.carburant.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


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
@Table(name="HistoCarburant")
public class HistoCarburant   implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Histo_carburant;
	 
     @ManyToOne
	@JoinColumn(name="Code_Station")
	private Station station ;
     
@ManyToOne
	@JoinColumn(name="Code_Carburant")
	private  Carburant carburant ;
	
	
	private Date date ;
	private int prix ;
	public Long getHisto_carburant() {
		return Histo_carburant;
	}
	public void setHisto_carburant(Long histo_carburant) {
		Histo_carburant = histo_carburant;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public HistoCarburant(Long histo_carburant, Date date, int prix) {
		super();
		Histo_carburant = histo_carburant;
		this.date = date;
		this.prix = prix;
	}
	public HistoCarburant() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
