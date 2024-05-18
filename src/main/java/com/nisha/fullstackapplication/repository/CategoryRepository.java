package com.nisha.fullstackapplication.repository;

import com.nisha.fullstackapplication.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
