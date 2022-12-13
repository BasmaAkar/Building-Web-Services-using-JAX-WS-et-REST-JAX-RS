package org.station.carburant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.station.carburant.WS.CarburantCrudImpl;
import org.station.carburant.WS.StationCrudImpl;

import jakarta.xml.ws.Endpoint;

@SpringBootApplication
public class ApplicationWebSercicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationWebSercicesApplication.class, args);
		Endpoint.publish("http://localhost:9090/soap/station", new StationCrudImpl());
		Endpoint.publish("http://localhost:9090/soap/carburant", new CarburantCrudImpl());
	}

}
