package org.hacksc.service;

import com.fasterxml.uuid.Generators;
import lombok.extern.slf4j.Slf4j;
import org.hacksc.model.db.Shelter;
import org.hacksc.model.db.UserSOS;
import org.hacksc.repository.ShelterRepository;
import org.hacksc.repository.UserSOSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserSOSService {

    @Autowired
    UserSOSRepository userSOSRepository;

    public List<UserSOS> getUser(){
        return userSOSRepository.findAllUser();
    }

}
