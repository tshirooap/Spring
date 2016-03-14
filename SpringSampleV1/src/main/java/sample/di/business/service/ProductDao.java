package sample.di.business.service;

import sample.di.business.valueobject.Product;

public interface ProductDao {

	public Product findProduct(String name);
	
}
