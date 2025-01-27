package com.niMap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.niMap.entity.Category;
import com.niMap.entity.Product;
import com.niMap.repository.CategoryRepository;
import com.niMap.repository.ProductRepository;
@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Autowired
	private CategoryRepository  categoryRepository;
	
	public List<Product> getAllProducts() {
		return repository.findAll();
	}

	public Product getProduct(long id) {
		return repository.findById(id).get();
	}

    public Product updateProduct(Long id, Product updatedProduct) {
        Product product = getProduct(id);
        if (product != null) {
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            product.setQuantity(updatedProduct.getQuantity());

            Category category= categoryRepository.findById(updatedProduct.getCategory().getId()).get();
            System.out.println(category);
            if (category != null) {
				product.setCategory(category);
			}
            System.out.println(categoryRepository.findById( updatedProduct.getCategory().getId()).get().getName());            
            return repository.save(product);
        }
        return null;
    }

	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	

	public void deleteProduct(long id) {
		Product product= getProduct(id);
		product.setCategory(null);
		repository.delete(product);
		System.out.println("-----------------------Product Deleted-----------------------");
		
	}

	public Page<Product>getProducts(int page){
		if(page!=0) {
			 Pageable pageable = PageRequest.of(page, 4);
			 return repository.findAll(pageable);
			 
		 }
		 Pageable pageable = PageRequest.of(0, 4);
		 return repository.findAll(pageable);
	
		 
	    
	}

}
