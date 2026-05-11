package org.glsid.backend.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@DiscriminatorValue("AUTO")
@Data @NoArgsConstructor @AllArgsConstructor
public class ContratAutomobile extends ContratAssurance {
    private String matricule;
    private String marque;
    private String modele;
}
