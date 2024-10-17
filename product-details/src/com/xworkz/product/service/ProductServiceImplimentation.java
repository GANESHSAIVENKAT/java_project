package com.xworkz.product.service;

import java.util.List;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.repository.ProductRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ProductServiceImplimentation implements ProductService {
	private ProductRepo repo;
	@Override
	public String validate(ProductDto productDto) {
		System.out.println("Validate is running");
		if(productDto!=null){
			if(repo.onSave(productDto)) {
				return"Saved sucessfully";
			}
		}
		return "Not Saved sucessfully";
	}

	@Override
	public List<ProductDto> getAll() {
		
		return repo.getAll();
	}

	@Override
	public String updateById(int productId, ProductDto productDto) {
		if(productId>0) {
			if(repo.updateById(productId, productDto)) {
				return"Updatesucessfully";
			}
		}
		return "notupdated";
	}

	@Override
	public String deleteById(int productId, ProductDto productDto) {
		if(productId>0) {
			if(repo.deleteById(productId, productDto)) {
				return"Deletesucessfully";
			}
		}
		return "notdeleted";
	}

}
