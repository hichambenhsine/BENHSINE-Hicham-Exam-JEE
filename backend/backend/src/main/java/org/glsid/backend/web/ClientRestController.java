package org.glsid.backend.web;

import lombok.AllArgsConstructor;
import org.glsid.backend.DTOs.ClientDTO;
import org.glsid.backend.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@AllArgsConstructor
@CrossOrigin("*")
public class ClientRestController {
    private ClientService clientService;

    @GetMapping
    public List<ClientDTO> clients() {
        return clientService.listClients();
    }

    @GetMapping("/{id}")
    public ClientDTO getClient(@PathVariable Long id) {
        return clientService.getClient(id);
    }

    @PostMapping
    public ClientDTO saveClient(@RequestBody ClientDTO clientDTO) {
        return clientService.saveClient(clientDTO);
    }
}
