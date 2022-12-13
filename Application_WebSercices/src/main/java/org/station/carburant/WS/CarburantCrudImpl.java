package org.station.carburant.WS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.station.carburant.entites.Carburant;
import org.station.carburant.entites.Station;


public class CarburantCrudImpl implements CarburantCrud {
	 private static int lastId = 0;

 private List<Carburant> carburants = new ArrayList<Carburant>();
	public CarburantCrudImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Carburant> Listar() {
		return carburants ;
	}

	@Override
	public void insertat(String nom, String des) {
		   Long id = generateId();
		  Carburant car = new  Carburant(id,nom,des);
		    carburants.add(car);
		
	}
	//*******POUR INCREMENTER LA VALEUR DE ID
		private Long generateId() {
	        return (long) ++lastId;
	    }
	    public int count() {
	        return carburants.size();
	    }

	@Override
	public void  actualizar(Long id, String des ,String name ) {
		 for (Iterator<Carburant> iterator =carburants.iterator(); iterator.hasNext();) {
	            Carburant s = (Carburant) iterator.next();
	            if (id.equals(String.valueOf(s.getId_carburant()  )  )  ) {
	    s.setDescription(des);
	    s.setNom_carburant(des);
	      s.setId_carburant(id);
	   s.setDescription(des);
	                break;
	            }
		 }
	}

	@Override
	public int eliminar(String id) {
		 for (Iterator<Carburant> iterator = carburants.iterator(); iterator.hasNext();) {
	            Carburant carb = (Carburant) iterator.next();
	            if (id.equals(String.valueOf(carb.getId_carburant()))) {
	                iterator.remove();
	                break;
	            }
	        }
		return 0;
	}
	}


