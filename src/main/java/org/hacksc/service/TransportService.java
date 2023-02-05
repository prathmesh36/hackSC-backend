package org.hacksc.service;

import com.fasterxml.uuid.Generators;
import lombok.extern.slf4j.Slf4j;
import org.hacksc.model.db.Shelter;
import org.hacksc.model.db.Transport;
import org.hacksc.repository.ShelterRepository;
import org.hacksc.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TransportService {

    @Autowired
    TransportRepository transportRepository;

    public List<Transport> getTransport(){
        return transportRepository.findAllTransport();
    }

    public List<Transport> getTransportByZip(String zip){
        return transportRepository.findTransportByZip(zip);
    }

    public void addTransport(Transport transport) {
        try {
            transport.setTransportid(Generators.timeBasedGenerator().generate().toString());
            transportRepository.save(transport);
        } catch(Exception e){
            log.error("Error in persisting UserDetails: " + e);
            throw new RuntimeException(e);
        }
    }
}
