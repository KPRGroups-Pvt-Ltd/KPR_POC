/**
 * @author rajukshirsagar
 * @package com.example.demo
 * @date 03/03/24
 * @time 4:15 PM
 * @month Mar
 * @year 2024
 * @emailID raju.kshirsagar151@gmail.com
 */

package com.example.demo.utils;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Product;
import com.example.demo.modal.ProductResponse;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MapperConvert {

	ModelMapper modelMapper = new ModelMapper();
	//Entity to DTO
	public ProductResponse getDTOFromEntity(Product product) {
		return modelMapper.map(product, ProductResponse.class);
	}
	public List<ProductResponse> getDTOFromEntityList(List<Product> product) {
		return (List<ProductResponse>) modelMapper.map(product, ProductResponse.class);
	}
	//DTO to entity
	public Product getEntityFromDTO(ProductResponse productResponse) {
		return modelMapper.map(productResponse, Product.class);
	}
}
