package org.glsid.backend.services;

import lombok.AllArgsConstructor;
import org.glsid.backend.DTOs.PaiementDTO;
import org.glsid.backend.entities.ContratAssurance;
import org.glsid.backend.entities.Paiement;
import org.glsid.backend.mappers.PaiementMapper;
import org.glsid.backend.repositories.ContratRepository;
import org.glsid.backend.repositories.PaiementRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class PaiementServiceImpl implements PaiementService {
    private PaiementRepository paiementRepository;
    private ContratRepository contratRepository;
    private PaiementMapper paiementMapper;

    @Override
    public PaiementDTO savePaiement(PaiementDTO dto, Long contratId) {
        ContratAssurance contrat = contratRepository.findById(contratId)
                .orElseThrow(() -> new RuntimeException("Contrat non trouvé"));
        Paiement paiement = paiementMapper.fromPaiementDTO(dto);
        paiement.setContrat(contrat);
        return paiementMapper.fromPaiement(paiementRepository.save(paiement));
    }

    @Override
    public List<PaiementDTO> getPaiementsByContrat(Long contratId) {
        return paiementRepository.findAll().stream()
                .filter(p -> p.getContrat().getId().equals(contratId))
                .map(paiementMapper::fromPaiement)
                .collect(Collectors.toList());
    }
}