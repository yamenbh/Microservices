package com.aitelbhiri.services;

import com.aitelbhiri.entities.Voiture;
import com.aitelbhiri.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureService {

    private final VoitureRepository voitureRepository;

    @Autowired
    public VoitureService(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    public Voiture enregistrerVoiture(Voiture voiture) {
        // Check if the voiture already exists based on an identifier, for example, 'id'
        if (voiture.getId() != null && voitureRepository.existsById(voiture.getId())) {
            // If it exists, update the existing record
            return voitureRepository.save(voiture);
        } else {
            // If it doesn't exist, save a new record
            return voitureRepository.save(voiture);
        }
    }

}
