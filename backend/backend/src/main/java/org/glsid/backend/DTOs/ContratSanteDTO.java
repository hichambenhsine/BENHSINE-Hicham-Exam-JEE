package org.glsid.backend.DTOs;

import lombok.Data;
import org.glsid.backend.enums.NiveauCouverture;

@Data
public class ContratSanteDTO extends ContratAssuranceDTO {
    private NiveauCouverture niveauCouverture;
    private int nombrePersonnesCouvertes;
}
