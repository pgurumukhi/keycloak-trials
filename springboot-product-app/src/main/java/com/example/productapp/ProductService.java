/**
 * 
 */
package com.example.productapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author PankajG
 *
 */
@Component
public class ProductService {
	
	public List<String> getProducts(){
		return Arrays.asList("iPAD","iPOD","iPhone");
	}

}
