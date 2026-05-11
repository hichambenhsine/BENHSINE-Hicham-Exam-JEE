package org.glsid.backend.DTOs;

import lombok.Data;

@Data
public class ContratAutomobileDTO extends ContratAssuranceDTO {
    private String matricule;
    private String marque;
    private String modele;
}
