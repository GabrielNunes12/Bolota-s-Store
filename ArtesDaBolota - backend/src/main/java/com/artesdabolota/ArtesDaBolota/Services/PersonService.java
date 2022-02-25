package com.artesdabolota.ArtesDaBolota.Services;

import com.artesdabolota.ArtesDaBolota.Constants.Status;
import com.artesdabolota.ArtesDaBolota.DTOs.PersonDTO;
import com.artesdabolota.ArtesDaBolota.Models.PersonModel;
import com.artesdabolota.ArtesDaBolota.Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Transactional(readOnly = true)
    public Status findById(PersonDTO personDTO){
        List<PersonModel> obj = personRepository.findAll();
        for (PersonModel person : obj) {
            if(person.equals(personDTO)) {
                person.setLoggedIn(true);
                personRepository.save(person);
            }
            return Status.SUCCESS;
        }
        return Status.FAILURE;
    }

    @Transactional(readOnly = true)
    public PersonDTO registerUser(PersonDTO personDTO) {
        PersonModel personModel = new PersonModel();
        copyDataToModel(personDTO, personModel);
        personModel = personRepository.save(personModel);
        return new PersonDTO(personModel);
    }

    private void copyDataToModel (PersonDTO personDTO, PersonModel personModel){
        personModel.setName(personDTO.getName());
        personModel.setEmail(personDTO.getEmail());
        personModel.setPassword(personDTO.getPassword());
    }
}
