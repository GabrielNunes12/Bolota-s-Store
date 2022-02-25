package com.artesdabolota.ArtesDaBolota.Controllers;

import com.artesdabolota.ArtesDaBolota.Constants.Status;
import com.artesdabolota.ArtesDaBolota.DTOs.PersonDTO;
import com.artesdabolota.ArtesDaBolota.Models.PersonModel;
import com.artesdabolota.ArtesDaBolota.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/people")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping(value = "/login")
    public Status findPersonByEmail(@RequestBody PersonDTO personDTO) {
        return personService.findById(personDTO);
    }

    @PostMapping(value = "/register")
    public ResponseEntity<PersonDTO> createUser(@RequestBody PersonDTO personDTO) {
        personDTO = personService.registerUser(personDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(personDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(personDTO);
    }
}
