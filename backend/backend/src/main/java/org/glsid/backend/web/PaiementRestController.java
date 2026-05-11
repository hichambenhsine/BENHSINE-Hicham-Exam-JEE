package org.glsid.backend.web;


import lombok.AllArgsConstructor;
import org.glsid.backend.DTOs.PaiementDTO;
import org.glsid.backend.services.PaiementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paiements")
@AllArgsConstructor
@CrossOrigin("*")
public class PaiementRestController {
    private PaiementService paiementService;

    @PostMapping("/{contratId}")
    public PaiementDTO savePaiement(@RequestBody PaiementDTO dto, @PathVariable Long contratId) {
        return paiementService.savePaiement(dto, contratId);
    }

    @GetMapping("/contrat/{contratId}")
    public List<PaiementDTO> getPaiements(@PathVariable Long contratId) {
        return paiementService.getPaiementsByContrat(contratId);
    }
}
