package com.artesdabolota.ArtesDaBolota.Services;

import com.artesdabolota.ArtesDaBolota.DTOs.CategoryDTO;
import com.artesdabolota.ArtesDaBolota.DTOs.ProductDTO;
import com.artesdabolota.ArtesDaBolota.Models.Category;
import com.artesdabolota.ArtesDaBolota.Models.Product;
import com.artesdabolota.ArtesDaBolota.Repositories.CategoryRepository;
import com.artesdabolota.ArtesDaBolota.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAllPaged(PageRequest pageRequest) {
        //Recuperando a lista do banco já paginado
        Page<Product> list = productRepository.findAll(pageRequest);
        //converter lista de categoria para lista de DTO
        return list.map(x -> new ProductDTO(x));
    }
    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        Product product = obj.orElseThrow(() -> new ExceptionHandler("Object not found"));
        return new ProductDTO(product, product.getCategories());
    }

    @Transactional
    public ProductDTO insertCategory(ProductDTO dto) {
        Product product = new Product();
        copyDtoToEntity(dto, product);
        product = productRepository.save(product);
        return new ProductDTO(product);
    }

    private void copyDtoToEntity(ProductDTO dto, Product product) {
        product.setDate(dto.getDate());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setImgUrl(dto.getImgUrl());
        product.setName(dto.getName());
        product.getCategories().clear();

        product.getCategories().forEach(categoryDTO -> {
            Category category = categoryRepository.getOne(categoryDTO.getId());
            product.getCategories().add(category);
        });
    }

    @Transactional
    public ProductDTO updateCategory(Long id, ProductDTO dto) {
        //Buscar id no banco
        //setar na model o novo nome do corpo da request
        //salvar esse novo objeto
        //retornar para front esse novo objeto
        try {
            Product product = productRepository.getOne(id);
            copyDtoToEntity(dto, product);
            product = productRepository.save(product);
            return new ProductDTO(product);
        } catch (EntityNotFoundException exception) {
            throw new ExceptionHandler("Id not found" + id);
        }
    }

    public void deleteCategory(Long id) {
        //Buscar id no banco
        //removendo pelo id passado
        try {
            productRepository.deleteById(id);
        }//tratando exceção caso id não for encontrado
        catch (EmptyResultDataAccessException exception) {
            throw new ExceptionHandler("Id not found" + id);
        }//tratando a exceção para violação de integridade do banco caso a categoria for deletada.
        catch (DataIntegrityViolationException dataIntegrityViolationException) {
            throw new ExceptionHandler("Category not found!" + dataIntegrityViolationException);
        }
    }
}
