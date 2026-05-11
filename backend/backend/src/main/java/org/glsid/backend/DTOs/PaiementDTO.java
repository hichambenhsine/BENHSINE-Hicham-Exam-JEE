package org.glsid.backend.DTOs;

import lombok.Data;
import org.glsid.backend.enums.TypePaiement;

import java.util.Date;

@Data
public class PaiementDTO {
    private Long id;
    private Date date;
    private double montant;
    private TypePaiement type;
}
