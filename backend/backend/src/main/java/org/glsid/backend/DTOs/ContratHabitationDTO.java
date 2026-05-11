package org.glsid.backend.DTOs;

import lombok.Data;
import org.glsid.backend.enums.TypeLogement;

@Data
public class ContratHabitationDTO extends ContratAssuranceDTO {
    private TypeLogement typeLogement;
    private String adresse;
    private double superficie;
}