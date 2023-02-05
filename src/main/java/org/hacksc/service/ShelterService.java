package org.hacksc.service;

import com.fasterxml.uuid.Generators;
import lombok.extern.slf4j.Slf4j;
import org.hacksc.model.db.Shelter;
import org.hacksc.repository.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ShelterService {

    @Autowired
    ShelterRepository shelterRepository;

    public List<Shelter> getShelter(){
        return shelterRepository.findAllShelter();
    }

    public List<Shelter> getShelterByZip(String zip){
        return shelterRepository.findShelterByZip(zip);
    }

    public void addShelter(Shelter shelter) {
        try {
            shelter.setShelterid(Generators.timeBasedGenerator().generate().toString());
            shelterRepository.save(shelter);
        } catch(Exception e){
            log.error("Error in persisting UserDetails: " + e);
            throw new RuntimeException(e);
        }
    }
}
