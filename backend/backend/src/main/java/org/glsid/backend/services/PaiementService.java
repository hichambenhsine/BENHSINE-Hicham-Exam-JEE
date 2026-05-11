package org.glsid.backend.services;

import org.glsid.backend.DTOs.PaiementDTO;

import java.util.List;

public interface PaiementService {
    PaiementDTO savePaiement(PaiementDTO dto, Long contratId);
    List<PaiementDTO> getPaiementsByContrat(Long contratId);
}