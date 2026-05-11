package org.glsid.backend.mappers;

import org.glsid.backend.DTOs.ContratAutomobileDTO;
import org.glsid.backend.DTOs.ContratHabitationDTO;
import org.glsid.backend.DTOs.ContratSanteDTO;
import org.glsid.backend.entities.ContratAutomobile;
import org.glsid.backend.entities.ContratHabitation;
import org.glsid.backend.entities.ContratSante;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ContratMapper {
    public ContratAutomobileDTO fromContratAutomobile(ContratAutomobile contrat){
        ContratAutomobileDTO dto = new ContratAutomobileDTO();
        BeanUtils.copyProperties(contrat, dto);
        dto.setType("AUTO");
        return dto;
    }
    public ContratHabitationDTO fromContratHabitation(ContratHabitation contrat){
        ContratHabitationDTO dto = new ContratHabitationDTO();
        BeanUtils.copyProperties(contrat, dto);
        dto.setType("HABITATION");
        return dto;
    }
    public ContratSanteDTO fromContratSante(ContratSante contrat){
        ContratSanteDTO dto = new ContratSanteDTO();
        BeanUtils.copyProperties(contrat, dto);
        dto.setType("SANTE");
        return dto;
    }
}