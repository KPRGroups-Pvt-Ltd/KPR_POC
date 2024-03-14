/**
 * @author rajukshirsagar
 * @package com.example.openApiDoc.config
 * @date 03/03/24
 * @time 4:15 PM
 * @month Mar
 * @year 2024
 * @emailID raju.kshirsagar151@gmail.com
 */

package com.example.demo.modal;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
	
	private Long id; 
	private String name; 
	private double price; 
    private int quantity;
    
}
