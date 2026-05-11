package org.glsid.backend;

import org.glsid.backend.entities.Client;
import org.glsid.backend.entities.ContratAutomobile;
import org.glsid.backend.enums.StatutContrat;
import org.glsid.backend.repositories.ClientRepository;
import org.glsid.backend.repositories.ContratRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepository clientRepository,
                            ContratRepository contratRepository) {
        return args -> {
            Client client = Client.builder()
                    .nom("Hicham Benhsine")
                    .email("hicham@example.com")
                    .build();
            clientRepository.save(client);

            ContratAutomobile auto = new ContratAutomobile();
            auto.setDateSouscription(new Date());
            auto.setStatut(StatutContrat.VALIDE);
            auto.setMontantCotisation(4500.0);
            auto.setMatricule("12345-B-10");
            auto.setMarque("Toyota");
            auto.setModele("Yaris");
            auto.setClient(client);
            contratRepository.save(auto);

            System.out.println("--- Test DAO: Données insérées ---");
        };
    }

}
