package it.dipendentepubico.CCIS.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"it.dipendentepubico.CCIS.usecase",
		"it.dipendentepubico.CCIS.converter",
		"it.dipendentepubico.CCIS.service",
		"it.dipendentepubico.CCIS.adapter.repository"
})
public class CiccioCappuccioInterexchangeServiceApplication {

	/**
	 * launch passing -Djavax.xml.accessExternalSchema=file -Djavax.xml.accessExternalDTD=file
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CiccioCappuccioInterexchangeServiceApplication.class, args);
	}

}
