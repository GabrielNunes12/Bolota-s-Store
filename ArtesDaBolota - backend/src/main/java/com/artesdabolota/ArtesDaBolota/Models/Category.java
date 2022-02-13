package com.artesdabolota.ArtesDaBolota.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Table(name="tb_category")
@Entity
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Category(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) && Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
