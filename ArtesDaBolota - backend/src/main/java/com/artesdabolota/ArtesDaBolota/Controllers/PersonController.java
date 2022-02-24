package com.artesdabolota.ArtesDaBolota.Controllers;

import com.artesdabolota.ArtesDaBolota.Constants.Status;
import com.artesdabolota.ArtesDaBolota.DTOs.PersonDTO;
import com.artesdabolota.ArtesDaBolota.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/people")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping(value = "/login")
    public Status findPersonByEmail(@RequestBody PersonDTO personDTO) {
        return personService.findById(personDTO);
    }
}
