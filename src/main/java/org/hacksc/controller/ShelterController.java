package org.hacksc.controller;

import org.hacksc.model.db.Shelter;
import org.hacksc.service.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
@CrossOrigin(origins = "http://localhost:3000", methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class ShelterController {

    @Autowired
    ShelterService shelterService;

    @GetMapping("/getShelter")
    public List<Shelter> getShelter(){
        return shelterService.getShelter();
    }

    @GetMapping("/getShelterByZip")
    public List<Shelter> getShelterByZip(String zip){
        return shelterService.getShelterByZip(zip);
    }

    @PostMapping("/addShelter")
    public ResponseEntity<String> addShelter(@RequestBody Shelter shelter){
        try {
            shelterService.addShelter(shelter);
            return ResponseEntity.ok("OK");
        }catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("NOT OK");
        }
    }

}
