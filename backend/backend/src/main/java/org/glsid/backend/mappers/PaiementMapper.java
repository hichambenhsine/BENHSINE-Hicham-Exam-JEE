package org.glsid.backend.mappers;

import org.glsid.backend.DTOs.PaiementDTO;
import org.glsid.backend.entities.Paiement;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class PaiementMapper {
    public PaiementDTO fromPaiement(Paiement paiement) {
        PaiementDTO dto = new PaiementDTO();
        BeanUtils.copyProperties(paiement, dto);
        return dto;
    }

    public Paiement fromPaiementDTO(PaiementDTO dto) {
        Paiement paiement = new Paiement();
        BeanUtils.copyProperties(dto, paiement);
        return paiement;
    }
}
