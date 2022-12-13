package org.station.carburant.WS;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


import org.springframework.data.jpa.repository.JpaRepository;
import org.station.carburant.entites.Station;

import jakarta.jws.WebParam;
@WebService
public interface StationCrud {
@WebMethod
    //*****lister
	public List <Station> Listar() ;
	//**inserer
	public  void  insertat(String nom , String ville , String Ad);
	//*****UPDATE
	public Station actualizar(
			@WebParam(name = "id") String id,
            @WebParam(name = "name") String name  ,
	        @WebParam(name = "ville ") String ville ,
	        @WebParam(name = "Adresse") String Ad 
);
	//****delete
	public int eliminar(@WebParam(name = "id") String id);
	
	
}
