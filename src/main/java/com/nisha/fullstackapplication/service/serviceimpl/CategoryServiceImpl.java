package com.nisha.fullstackapplication.service.serviceimpl;

import com.nisha.fullstackapplication.entity.Category;
import com.nisha.fullstackapplication.repository.CategoryRepository;
import com.nisha.fullstackapplication.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
