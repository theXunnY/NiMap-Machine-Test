package com.niMap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niMap.entity.Category;
import com.niMap.entity.Product;
import com.niMap.repository.CategoryRepository;
import com.niMap.repository.ProductRepository;

import jakarta.annotation.PostConstruct;

@Service
public class DemoDataInitializerService {

	  @Autowired
	    private CategoryRepository categoryRepository;

	    @Autowired
	    private ProductRepository productRepository;

	    @PostConstruct
	    public void init() {
	        if (categoryRepository.count() == 0 && productRepository.count() == 0) {
	            createSampleCategoriesAndProducts();
	        }
	    }
	    
	    String[] str= {"Electronics" , "Home", "Kitchen", "Kids", "Adult"};
	    private void createSampleCategoriesAndProducts() {
	        for (int i = 1; i <= 5; i++) {
	            Category category = new Category();
	            category.setName(str[i-1]);
	            categoryRepository.save(category);
	            
	            for (int j = 1; j <=5; j++) {
	                Product product = new Product();
	                product.setName("Product " + j);
	                product.setPrice(Math.random() * 100); 
	                product.setCategory(category);         
	                productRepository.save(product);
	            }
	        }
	    }
}
