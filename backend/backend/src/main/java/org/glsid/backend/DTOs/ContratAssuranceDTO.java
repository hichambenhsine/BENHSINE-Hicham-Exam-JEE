package org.glsid.backend.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.glsid.backend.enums.StatutContrat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class ContratAssuranceDTO {
    private Long id;
    private Date dateSouscription;
    private StatutContrat statut;
    private Date dateValidation;
    private double montantCotisation;
    private int dureeContrat;
    private double tauxCouverture;
    private String type;
}