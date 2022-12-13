package org.station.carburant.WS;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.station.carburant.entites.Carburant;
import org.station.carburant.entites.Station;

import jakarta.jws.WebParam;

public interface CarburantCrud {
	
		public List <Carburant> Listar() ;

		public  void  insertat(String nom , String des );
		//*****UPDATE
		public void  actualizar(
				@WebParam(name = "id") Long id,
	            @WebParam(name = "des") String des  ,
	            @WebParam(name = "nom") String nom 
		  
	);

		public int eliminar(@WebParam(name = "id") String id);
}
