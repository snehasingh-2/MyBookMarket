package com.book.demo.global;

import java.util.ArrayList;
import java.util.List;

import com.book.demo.model.Product;

public class GlobalData {
	public static List<Product> cart;
	static {
		cart = new ArrayList<Product>();
	}
}
