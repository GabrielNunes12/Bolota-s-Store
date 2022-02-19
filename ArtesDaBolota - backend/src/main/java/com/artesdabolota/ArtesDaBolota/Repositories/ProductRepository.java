package com.artesdabolota.ArtesDaBolota.Repositories;

import com.artesdabolota.ArtesDaBolota.Models.Category;
import com.artesdabolota.ArtesDaBolota.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
