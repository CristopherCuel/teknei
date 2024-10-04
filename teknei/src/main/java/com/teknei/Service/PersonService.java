package com.teknei.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonService {

    private final RestTemplate restTemplate;

    public PersonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<String> getRandomUser() {
        String url = "https://api.randomuser.me/";
        return restTemplate.getForEntity(url, String.class);
    }
}
