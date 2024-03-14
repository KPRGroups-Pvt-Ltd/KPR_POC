/**
 * @author rajukshirsagar
 * @package com.example.openApiDoc.config
 * @date 03/03/24
 * @time 4:15 PM
 * @month Mar
 * @year 2024
 * @emailID raju.kshirsagar151@gmail.com
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.modal.ProductResponse;
import com.example.demo.repo.ProductRepository;
import com.example.demo.service.ProductService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class ProductController {
	@Autowired
	ProductService productService;

	// Get all products
	@GetMapping("/products")
	public List<ProductResponse> getAllProducts() {
		return productService.getAllProducts();
	}
	// Get a product by ID
	
	@GetMapping("/products/{id}")
	public ResponseEntity<ProductResponse> getProductById(@PathVariable Long id) {
		ProductResponse product = productService.getProductById(id);
		if (product != null) {
			return ResponseEntity.ok(product);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	 
	// Create a new product 
	@PostMapping("/product") 
	public void saveProduct(@RequestBody Product product) 
	{ 
		 productService.saveProduct(product); 
	}


	// Update a product
	@PutMapping(path = "/products/{productId}")
	public ResponseEntity<ProductResponse> updateProduct(@PathVariable(value = "productId") Long productId,
			@RequestBody Product product) {
		return productService.updateProduct(productId, product);
	}

	// Delte a product
	@DeleteMapping(value = "/products/{productId}")
	public String deleteProduct(@PathVariable Long productId) {
		productService.deleteProduct(productId);
		return "Product Deleted Successfully against id " + productId + " ";
	}
	/*
	 * @GetMapping("/products/{id}") public ResponseEntity<ProductResponse>
	 * getProductById(@PathVariable Long id) { //ProductResponse product =
	 * productService.getProductById(id);
	 * 
	 * if (product != null) { return ResponseEntity<ProductResponse>.ok(product); }
	 * else { return ResponseEntity<ProductResponse>.notFound().build(); }
	 * 
	 * }
	 */

}
