package com.bootcamp.prebootcamptest.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	// using logger to display additional info
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	// using autowired annotation to make object of Dao class
	@Autowired
	ProductDaoService service;

	// using postmapping annotation to use post method for endpoint
	@PostMapping("/sortProducts")
	public Map<String, List<Product>> getSortedProduct(@RequestBody Map<String, List<Product>> productmap) {
		logger.info("sortProducts post method endpoint triggred");
		Map response = new HashMap<String, List<Product>>();
		response.put("sortedProductList", service.getSortedProduct(productmap.get("productList")));
		return response;
	}

}