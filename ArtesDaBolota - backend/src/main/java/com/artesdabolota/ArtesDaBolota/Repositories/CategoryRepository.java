package com.artesdabolota.ArtesDaBolota.Repositories;

import com.artesdabolota.ArtesDaBolota.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
