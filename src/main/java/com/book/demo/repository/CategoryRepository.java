package com.book.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.book.demo.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
