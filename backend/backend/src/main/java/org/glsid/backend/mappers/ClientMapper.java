package org.glsid.backend.mappers;

import org.glsid.backend.DTOs.ClientDTO;
import org.glsid.backend.entities.Client;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ClientMapper {
    public ClientDTO fromClient(Client client){
        ClientDTO dto = new ClientDTO();
        BeanUtils.copyProperties(client, dto);
        return dto;
    }
    public Client fromClientDTO(ClientDTO dto){
        Client client = new Client();
        BeanUtils.copyProperties(dto, client);
        return client;
    }
}
