package org.glsid.backend.entities;

import jakarta.persistence.*;
import lombok.*;
import org.glsid.backend.enums.NiveauCouverture;

@Entity
@DiscriminatorValue("SANTE")
@Data @NoArgsConstructor @AllArgsConstructor
public class ContratSante extends ContratAssurance {
    @Enumerated(EnumType.STRING)
    private NiveauCouverture niveauCouverture;
    private int nombrePersonnesCouvertes;
}
