package com.bootcamp.prebootcamptest.product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class ProductDaoService {

	// creating a list to store sorted products
	public List<Product> getSortedProduct(List<Product> product) {

		List<Product> sortedList = product.stream().sorted(comparingByProductIdAndLaunchDate)
				.collect(Collectors.toList());

		product.sort(comparingByProductIdAndLaunchDate);

		return product;
	}

	// using comparator to compare by product id and date
	Comparator<Product> comparingByProductIdAndLaunchDate = Comparator.comparing(Product::getProductId)
			.thenComparing(Product::getLaunchDate).reversed();

}
