package com.book.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.demo.model.Product;

import com.book.demo.repository.ProductRepository;

@Service
public class ProductService{
	@Autowired
	ProductRepository pr;
	
	public List<Product> getAllProduct(){
		return pr.findAll();
	}
	public void addProduct(Product product) {
		pr.save(product);
	}
	public void deleteProduct(Long id) {
		pr.deleteById(id);
	}
	public Optional<Product> getProductById(int id){
		return pr.findById((long) id);
	}
	public List<Product> getAllProductsByCategoryId(int id){
		return pr.findAllByCategory_Id(id);
	}
}
