package org.hacksc.controller;

import org.hacksc.model.db.UserSOS;
import org.hacksc.service.UserSOSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/v1/user")
@RestController
public class UserSOSController {

    @Autowired
    UserSOSService userSOSService;

    @CrossOrigin(origins="http://localhost:3000", allowedHeaders = "*")
    @GetMapping("/getUser")
    public List<UserSOS> getUser(){
        return userSOSService.getUser();
    }

}
