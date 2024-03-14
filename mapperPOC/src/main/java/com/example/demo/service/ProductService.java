/**
 * @author rajukshirsagar
 * @package com.example.openApiDoc.config
 * @date 03/03/24
 * @time 4:15 PM
 * @month Mar
 * @year 2024
 * @emailID raju.kshirsagar151@gmail.com
 */

package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Product;
import com.example.demo.modal.ProductResponse;
import com.example.demo.repo.ProductRepository;
import com.example.demo.utils.MapperConvert;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService { 
	@Autowired
	ProductRepository productRepository; 
	
	MapperConvert mapperConvert=new MapperConvert();
	
	public void saveProduct(Product product) 
	{ 
		Product newProduct = productRepository.save(product);
		//System.out.println("ProductService.saveProduct()"+newProduct);
		 //ResponseEntity.ok(mapperConvert.getDTOFromEntity(newProduct)); 
	}
	
	// Get all products 
	public ResponseEntity<List<ProductResponse> > fetchAllProducts() 
	{ 
		//mapperConvert.getDTOFromEntity(productRepository.findAll())
		return ResponseEntity.ok(mapperConvert.getDTOFromEntityList(productRepository.findAll())); 
	}

	// Get a product by ID 
	public ResponseEntity<Optional<Product> > 
	fetchProductById(Long id) 
	{ 
		Optional<Product> product 
			= productRepository.findById(id); 
		if (product.isPresent()) { 
			return ResponseEntity.ok(product); 
		} 
		else { 
			return ResponseEntity.notFound().build(); 
		} 
	}
	
	public ResponseEntity<ProductResponse> updateProduct(Long id, Product updatedProduct) 
	{ 
		if (id == null) { 
			throw new IllegalArgumentException( 
				"ID cannot be null"); 
		} 
		Product Existingproduct 
			= productRepository.findById(id).orElseThrow( 
				() 
					-> new EntityNotFoundException( 
						String.valueOf(id))); 
		Existingproduct.setName(updatedProduct.getName()); 
		Existingproduct.setPrice(updatedProduct.getPrice()); 
		Existingproduct.setQuantity( 
			updatedProduct.getQuantity()); 
		ProductResponse savedEntity 
			=mapperConvert.getDTOFromEntity(productRepository.save(Existingproduct)); 
		
		return ResponseEntity.ok(savedEntity); 
	}
	
	public ResponseEntity<String> deleteProduct(Long id) 
	{ 
		productRepository.deleteById(id); 
		return ResponseEntity.ok( 
			"Product Deleted Successfully"); 
	}

	public List<ProductResponse> getAllProducts() {
		// TODO Auto-generated method stub
		
		//return productRepository.findAll() ;
		return (List<ProductResponse>) ResponseEntity.ok(mapperConvert.getDTOFromEntityList(productRepository.findAll())); 
	}

	public ProductResponse getProductById(Long id) {
		// TODO Auto-generated method stub
		return mapperConvert.getDTOFromEntity(productRepository.findById(id).get());
		//return productRepository.findById(id).get();
	}
	
	
}

