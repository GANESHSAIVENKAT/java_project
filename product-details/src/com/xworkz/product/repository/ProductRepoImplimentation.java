package com.xworkz.product.repository;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.product.dto.ProductDto;


public class ProductRepoImplimentation implements ProductRepo {
	LinkedList<ProductDto> list = new LinkedList<ProductDto>();
	@Override
	public boolean onSave(ProductDto productDto) {
		System.out.println("save running");
		return list.add(productDto);
	}

	@Override
	public List<ProductDto> getAll() {
		Collections.sort((List)list);		
		return list;
	}

	@Override
	public boolean updateById(int productId, ProductDto productDto) {
		
		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getProductId() == productId) {
					list.set(i, productDto);
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteById(int productId, ProductDto productDto) {
		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getProductId() == productId) {
					list.removeAll(list);
				}
			}
			return true;
		}
		return false;
	}

}
