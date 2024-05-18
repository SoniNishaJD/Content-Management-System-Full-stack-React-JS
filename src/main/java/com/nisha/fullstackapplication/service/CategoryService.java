package com.nisha.fullstackapplication.service;

import com.nisha.fullstackapplication.entity.Category;

import java.util.List;

public interface CategoryService {

    public List<Category> getAllCategories() ;

    public Category createCategory(Category category);

    public Category getCategoryById(Long id);
}
