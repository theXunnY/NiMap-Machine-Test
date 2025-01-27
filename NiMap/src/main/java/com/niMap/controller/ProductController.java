package com.niMap.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niMap.entity.Product;
import com.niMap.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
//	@GetMapping
//	public List<Product> getAllProducts(){
//		return service.getAllProducts();
//	}
	
	@PostMapping()
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable long id) {
		return service.getProduct(id);
	}
	
	
	@PutMapping("/{id}" )
	public Product updateProduct(@PathVariable long id, @RequestBody Product product) {
		return service.updateProduct(id, product);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable long id) {
		service.deleteProduct(id);
	}
	
	@GetMapping
	Page<Product> getAllProducts(@RequestParam(defaultValue = "0") int page){
		return service.getProducts(page);
	}

}
