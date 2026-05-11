package org.glsid.backend.entities;

import jakarta.persistence.*;
import lombok.*;
import org.glsid.backend.enums.TypeLogement;

@Entity
@DiscriminatorValue("HABITATION")
@Data @NoArgsConstructor @AllArgsConstructor
public class ContratHabitation extends ContratAssurance {
    @Enumerated(EnumType.STRING)
    private TypeLogement typeLogement;
    private String adresse;
    private double superficie;
}
