package com.xworkz.product.repository;

import java.util.List;

import com.xworkz.product.dto.ProductDto;



public interface ProductRepo {


	boolean onSave(ProductDto productDto);
	List<ProductDto> getAll();
	boolean updateById(int productId,ProductDto productDto);
	boolean deleteById(int productId,ProductDto productDto);
}
