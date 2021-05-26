package com.example.controllers;

import com.example.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/person-table-by-category", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getPersonTableByCategory(@RequestParam String category) {

        return new ResponseEntity<>(personService.getPersonTableNameByCategory(category), HttpStatus.OK);
    }
}
