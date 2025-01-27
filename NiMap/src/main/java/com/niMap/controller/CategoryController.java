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

import com.niMap.entity.Category;
import com.niMap.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService service;

//	@GetMapping
//	public List<Category> getAllCategory() {
//		return service.getAllCategory();
//	}
	
	@PostMapping
	public Category saveCaregory(@RequestBody Category category) {
		return service.saveCategory(category);
	}
	
	@GetMapping("/{id}")
	public Category getCategory(@PathVariable long id) {
		return service.findById(id);
	}
	
	@PutMapping("/{id}")
	public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
		return service.updateCategory(id, category);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategoey(@PathVariable long id) {
		 service.deleteCategory(id);
	}
	
	 @GetMapping
	    public Page<Category> getCategories(@RequestParam(defaultValue = "0") int page) {
	        return service.getCategories(page);
	    }
	
}
