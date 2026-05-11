package org.glsid.backend.entities;

import jakarta.persistence.*;
import lombok.*;
import org.glsid.backend.enums.TypePaiement;
import java.util.Date;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Paiement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double montant;

    @Enumerated(EnumType.STRING)
    private TypePaiement type;

    @ManyToOne
    private ContratAssurance contrat;
}
