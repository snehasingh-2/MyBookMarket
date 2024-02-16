package com.book.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.book.demo.global.GlobalData;
import com.book.demo.model.Product;
import com.book.demo.service.ProductService;

public class CartController {
	@Autowired
	ProductService ps;
	@GetMapping("/addToCart/{id}")
	public String addToCart(@PathVariable int id) {		
		GlobalData.cart.add(ps.getProductById(id).get());
		return "redirect:/shop";
	}
	
	@GetMapping("/cart")
	public String cartGet(Model model) {
		model.addAttribute("cartCount", GlobalData.cart.size());
		model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
		model.addAttribute("cart", GlobalData.cart);
		return "cart";
	}
}
