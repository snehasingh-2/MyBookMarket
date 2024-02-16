package com.book.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.book.demo.global.GlobalData;
import com.book.demo.service.CategoryService;
import com.book.demo.service.ProductService;

@Controller
public class HomeController {
	@Autowired
	CategoryService cs;
	@Autowired
	ProductService ps;
	
	@GetMapping({"/", "/home"})
	public String home(Model model) {
		model.addAttribute("cartCount", GlobalData.cart.size());
		return "index";
	}
	
	@GetMapping("/shop")
	public String shop(Model model) {
		model.addAttribute("categories", cs.getAllCategory());
		model.addAttribute("products", ps.getAllProduct());
		model.addAttribute("cartCount", GlobalData.cart.size());
		return "shop";
	}
	
	@GetMapping("/shop/category/{id}")
	public String shopByCategory(Model model, @PathVariable int id) {
		model.addAttribute("categories", cs.getAllCategory());
		model.addAttribute("products", ps.getAllProductsByCategoryId(id));
		model.addAttribute("cartCount", GlobalData.cart.size());
		return "shop";
	}
	
	@GetMapping("/shop/viewproduct/{id}")
	public String viewProduct(Model model, @PathVariable int id) {
		model.addAttribute("product", ps.getProductById(id).get());
		model.addAttribute("cartCount", GlobalData.cart.size());
		return "viewProduct";
	}
}
