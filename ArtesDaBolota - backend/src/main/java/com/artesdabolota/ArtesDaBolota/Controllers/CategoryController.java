package com.artesdabolota.ArtesDaBolota.Controllers;

import com.artesdabolota.ArtesDaBolota.Models.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = new ArrayList<>();
        list.add(new Category("Books", 1L));
        list.add(new Category("eletronics", 2L));
        return ResponseEntity.ok(list);
    }
}
