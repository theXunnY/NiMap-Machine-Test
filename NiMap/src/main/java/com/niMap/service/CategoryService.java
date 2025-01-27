package com.niMap.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.niMap.entity.Category;
import com.niMap.entity.Product;
import com.niMap.repository.CategoryRepository;
import com.niMap.repository.ProductRepository;


@Service
public  class CategoryService  {

	@Autowired
	private CategoryRepository repository;
	
	@Autowired
	private ProductRepository productRepo;
	

	public List<Category> getAllCategory() {
		return repository.findAll();
	}

	public Category saveCategory(Category category) {
		return repository.save(category);
	}

	public Category findById(long id) {
		return repository.findById(id).get();
	}
	
	public Category updateCategory(long id, Category category) {
		Category category2= findById(id);
		category2.setName(category.getName());
		category2.setProducts(category.getProducts());
		return repository.save(category2);
	}

	
	public void deleteCategory(long id) {
		Category category=findById(id);
		
		List<Product> products=productRepo.findByCategory(category);
		
		for(Product p : products) {
			p.setCategory(null);
		}
		
		repository.delete(category);
	}
	
	 public Page<Category> getCategories(int page) {
		 
		 if(page!=0) {
			 Pageable pageable = PageRequest.of(page, 4);
			 return repository.findAll(pageable);
		 }
		 Pageable pageable = PageRequest.of(0, 4);
		 return repository.findAll(pageable);
	    }
	
}
