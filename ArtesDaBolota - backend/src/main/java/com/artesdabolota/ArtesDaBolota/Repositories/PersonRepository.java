package com.artesdabolota.ArtesDaBolota.Repositories;

import com.artesdabolota.ArtesDaBolota.DTOs.PersonDTO;
import com.artesdabolota.ArtesDaBolota.Models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonModel, Long> {
}
