package com.teknei.Controller;

import com.teknei.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/randomuser")
    public ResponseEntity<String> getRandomUser() {
        return personService.getRandomUser();
    }
}
