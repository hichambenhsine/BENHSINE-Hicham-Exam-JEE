package org.glsid.backend.services;

import lombok.AllArgsConstructor;
import org.glsid.backend.DTOs.*;
import org.glsid.backend.entities.*;
import org.glsid.backend.mappers.ContratMapper;
import org.glsid.backend.repositories.ClientRepository;
import org.glsid.backend.repositories.ContratRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class ContratServiceImpl implements ContratService {
    private ContratRepository contratRepository;
    private ClientRepository clientRepository;
    private ContratMapper contratMapper;

    @Override
    public ContratAutomobileDTO saveContratAuto(ContratAutomobileDTO dto, Long clientId) {
        Client client = clientRepository.findById(clientId).orElseThrow(() -> new RuntimeException("Client introuvable"));
        ContratAutomobile contrat = new ContratAutomobile();
        BeanUtils.copyProperties(dto, contrat);
        contrat.setClient(client);
        return contratMapper.fromContratAutomobile(contratRepository.save(contrat));
    }

    @Override
    public ContratHabitationDTO saveContratHabitation(ContratHabitationDTO dto, Long clientId) {
        Client client = clientRepository.findById(clientId).orElseThrow(() -> new RuntimeException("Client introuvable"));
        ContratHabitation contrat = new ContratHabitation();
        BeanUtils.copyProperties(dto, contrat);
        contrat.setClient(client);
        return contratMapper.fromContratHabitation(contratRepository.save(contrat));
    }

    @Override
    public ContratSanteDTO saveContratSante(ContratSanteDTO dto, Long clientId) {
        Client client = clientRepository.findById(clientId).orElseThrow(() -> new RuntimeException("Client introuvable"));
        ContratSante contrat = new ContratSante();
        BeanUtils.copyProperties(dto, contrat);
        contrat.setClient(client);
        return contratMapper.fromContratSante(contratRepository.save(contrat));
    }

    @Override
    public List<ContratAssuranceDTO> listContrats() {
        return contratRepository.findAll().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ContratAssuranceDTO getContrat(Long id) {
        ContratAssurance contrat = contratRepository.findById(id).orElseThrow(() -> new RuntimeException("Contrat introuvable"));
        return mapToDTO(contrat);
    }

    @Override
    public List<ContratAssuranceDTO> getContratsByClient(Long clientId) {
        return contratRepository.findAll().stream()
                .filter(c -> c.getClient().getId().equals(clientId))
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    private ContratAssuranceDTO mapToDTO(ContratAssurance contrat) {
        if (contrat instanceof ContratAutomobile) return contratMapper.fromContratAutomobile((ContratAutomobile) contrat);
        if (contrat instanceof ContratHabitation) return contratMapper.fromContratHabitation((ContratHabitation) contrat);
        if (contrat instanceof ContratSante) return contratMapper.fromContratSante((ContratSante) contrat);
        return null;
    }
}