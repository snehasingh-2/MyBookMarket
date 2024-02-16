package com.book.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.demo.model.Category;
import com.book.demo.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository cr;
	
	public List<Category> getAllCategory(){
		return cr.findAll();
	}
	public void addCategory(Category category) {
		cr.save(category);
	}
	public void deleteCategory(int id) {
		cr.deleteById(id);
	}
	public Optional<Category> getCategoryById(int id){
		return cr.findById(id);
	}
}