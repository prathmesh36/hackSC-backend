package org.hacksc.controller;

import org.hacksc.model.db.Shelter;
import org.hacksc.model.db.Transport;
import org.hacksc.service.ShelterService;
import org.hacksc.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/v1/user")
@RestController
public class TransportController {

    @Autowired
    TransportService transportService;

    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping("/getTransport")
    public List<Transport> getTransport(){
        return transportService.getTransport();
    }

    @CrossOrigin(origins="http://localhost:3000")
    @GetMapping("/getTransportByZip")
    public List<Transport> getTransportByZip(String zip){
        return transportService.getTransportByZip(zip);
    }

    @CrossOrigin(origins="http://localhost:3000")
    @PostMapping("/addTransport")
    public ResponseEntity<String> addTransport(@RequestBody Transport transport){
        try {
            transportService.addTransport(transport);
            return ResponseEntity.ok("OK");
        }catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("NOT OK");
        }
    }

}
