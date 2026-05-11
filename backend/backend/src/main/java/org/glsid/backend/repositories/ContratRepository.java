package org.glsid.backend.repositories;

import org.glsid.backend.entities.ContratAssurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<ContratAssurance, Long> {
}
