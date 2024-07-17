package com.lv.moviestore.services;

import com.lv.moviestore.models.Category;
import com.lv.moviestore.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CategoryService {
    CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    /**
     * Get all categories
     *
     * @return the list of categories
     */
    public List<Category> getCategories() {
        log.info("find all categories");
        return categoryRepository.findAll();
    }
}
