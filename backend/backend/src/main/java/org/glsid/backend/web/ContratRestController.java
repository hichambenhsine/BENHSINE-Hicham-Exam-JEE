package org.glsid.backend.web;

import lombok.AllArgsConstructor;
import org.glsid.backend.DTOs.ContratAssuranceDTO;
import org.glsid.backend.DTOs.ContratAutomobileDTO;
import org.glsid.backend.DTOs.ContratHabitationDTO;
import org.glsid.backend.DTOs.ContratSanteDTO;
import org.glsid.backend.services.ContratService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contrats")
@AllArgsConstructor
@CrossOrigin("*")
public class ContratRestController {
    private ContratService contratService;

    @GetMapping
    public List<ContratAssuranceDTO> listContrats() {
        return contratService.listContrats();
    }

    @PostMapping("/auto/{clientId}")
    public ContratAutomobileDTO saveAuto(@RequestBody ContratAutomobileDTO dto, @PathVariable Long clientId) {
        return contratService.saveContratAuto(dto, clientId);
    }

    @PostMapping("/habitation/{clientId}")
    public ContratHabitationDTO saveHabitation(@RequestBody ContratHabitationDTO dto, @PathVariable Long clientId) {
        return contratService.saveContratHabitation(dto, clientId);
    }

    @PostMapping("/sante/{clientId}")
    public ContratSanteDTO saveSante(@RequestBody ContratSanteDTO dto, @PathVariable Long clientId) {
        return contratService.saveContratSante(dto, clientId);
    }

    @GetMapping("/client/{clientId}")
    public List<ContratAssuranceDTO> getByClient(@PathVariable Long clientId) {
        return contratService.getContratsByClient(clientId);
    }
}
