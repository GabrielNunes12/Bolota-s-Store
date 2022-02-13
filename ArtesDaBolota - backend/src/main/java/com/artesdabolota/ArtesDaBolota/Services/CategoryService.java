package com.artesdabolota.ArtesDaBolota.Services;

import com.artesdabolota.ArtesDaBolota.DTOs.CategoryDTO;
import com.artesdabolota.ArtesDaBolota.Models.Category;
import com.artesdabolota.ArtesDaBolota.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> list = categoryRepository.findAll();
        List<CategoryDTO> listDto = new ArrayList<>();
        for(Category category : list) {
            listDto.add(new CategoryDTO(category));
        }
        return listDto;
    }
}
