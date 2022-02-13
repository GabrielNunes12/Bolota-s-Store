package com.artesdabolota.ArtesDaBolota.Services;

import com.artesdabolota.ArtesDaBolota.Models.Category;
import com.artesdabolota.ArtesDaBolota.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
