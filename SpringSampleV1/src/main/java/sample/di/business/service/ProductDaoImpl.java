package sample.di.business.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import sample.di.business.valueobject.Product;

@Component
//@Lazy
public class ProductDaoImpl implements ProductDao {

	/**
	 * Constructor
	 */
	public ProductDaoImpl(){
		System.out.println("bbbbbbbbbb");
		
	}
	public Product findProduct(String name) {
		return new Product(name, 100);
	}

	
}
