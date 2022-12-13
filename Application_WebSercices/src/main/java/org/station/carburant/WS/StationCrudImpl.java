package org.station.carburant.WS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.usertype.UserType;

import org.station.carburant.entites.Station;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;

public class StationCrudImpl  implements StationCrud {
	 private static int lastId = 0;

  private List<Station> stations = new ArrayList<Station>();
//********INSERTAR 
	@Override
	public void  insertat (String nom, String ville, String Ad) {
	 int id = generateId();
    Station station = new Station(id,nom,ville,Ad);
    stations.add(station);
	}
	//*******POUR INCREMENTER LA VALEUR DE ID
	private int generateId() {
        return ++lastId;
    }
	//*********LISTER
	@Override
	public List<Station> Listar() {
		return stations ;
	}
	// ****** COUNT SIZE OF LISTE 
    public int count() {
        return stations.size();
    }
//********** UPDATE 
	@Override
	public Station actualizar(String   id , String name , String ville , String Ad) {
		 for (Iterator<Station> iterator =stations.iterator(); iterator.hasNext();) {
	            Station s = (Station) iterator.next();
	            if (id.equals(String.valueOf(s.getId_station()  )  )  ) {
	      s.setNom(name);
	      s.setVille(ville);
	      s.setAdresse(Ad);
	              
	                break;
	            }
	        }
		return null;
	}
// ******** DELETE 
	@Override
	public int eliminar(String id) {
		 for (Iterator<Station> iterator = stations.iterator(); iterator.hasNext();) {
	            Station station = (Station) iterator.next();
	            if (id.equals(String.valueOf(station.getId_station()))) {
	                iterator.remove();
	                break;
	            }
	        }
		return 0;
	}




}
