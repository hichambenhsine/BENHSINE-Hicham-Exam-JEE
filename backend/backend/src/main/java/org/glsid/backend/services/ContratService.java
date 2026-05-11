package org.glsid.backend.services;

import org.glsid.backend.DTOs.*;
import java.util.List;

public interface ContratService {
    ContratAutomobileDTO saveContratAuto(ContratAutomobileDTO dto, Long clientId);
    ContratHabitationDTO saveContratHabitation(ContratHabitationDTO dto, Long clientId);
    ContratSanteDTO saveContratSante(ContratSanteDTO dto, Long clientId);

    List<ContratAssuranceDTO> listContrats();
    ContratAssuranceDTO getContrat(Long id);
    List<ContratAssuranceDTO> getContratsByClient(Long clientId);
}