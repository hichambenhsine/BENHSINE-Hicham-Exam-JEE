package org.glsid.backend.services;

import org.glsid.backend.DTOs.ClientDTO;

import java.util.List;

public interface ClientService {
    ClientDTO saveClient(ClientDTO clientDTO);
    List<ClientDTO> listClients();
    ClientDTO getClient(Long id);
    void deleteClient(Long id);
}