package com.artesdabolota.ArtesDaBolota.Services;

import com.artesdabolota.ArtesDaBolota.DTOs.CategoryDTO;
import com.artesdabolota.ArtesDaBolota.Models.Category;
import com.artesdabolota.ArtesDaBolota.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public Page<CategoryDTO> findAllPaged(PageRequest pageRequest) {
        //Recuperando a lista do banco já paginado
        Page<Category> list = categoryRepository.findAll(pageRequest);
        //converter lista de categoria para lista de DTO
        return list.map(x -> new CategoryDTO(x));
    }
    @Transactional(readOnly = true)
    public CategoryDTO findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        Category category = obj.orElseThrow(() -> new ExceptionHandler("Object not found"));
        return new CategoryDTO(category);
    }

    @Transactional
    public CategoryDTO insertCategory(CategoryDTO dto) {
        Category category = new Category();
        category.setName(dto.getName());
        category = categoryRepository.save(category);
        return new CategoryDTO(category);
    }

    @Transactional
    public CategoryDTO updateCategory(Long id, CategoryDTO dto) {
        //Buscar id no banco
        //setar na model o novo nome do corpo da request
        //salvar esse novo objeto
        //retornar para front esse novo objeto
        try {
            Category category = categoryRepository.getOne(id);
            category.setName(dto.getName());
            category = categoryRepository.save(category);
            return new CategoryDTO(category);
        } catch (EntityNotFoundException exception) {
            throw new ExceptionHandler("Id not found" + id);
        }
    }

    public void deleteCategory(Long id) {
        //Buscar id no banco
        //removendo pelo id passado
        try {
            categoryRepository.deleteById(id);
        }//tratando exceção caso id não for encontrado
        catch (EmptyResultDataAccessException exception) {
            throw new ExceptionHandler("Id not found" + id);
        }//tratando a exceção para violação de integridade do banco caso a categoria for deletada.
        catch (DataIntegrityViolationException dataIntegrityViolationException) {
            throw new ExceptionHandler("Category not found!" + dataIntegrityViolationException);
        }
    }
}
