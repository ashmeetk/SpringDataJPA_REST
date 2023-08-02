package com.ashmeet.spring.data.springdatajpa;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.ashmeet.spring.data.springdatajpa.entities.Product;
import com.ashmeet.spring.data.springdatajpa.repos.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {
	
	@Autowired
	ApplicationContext context;
	
	@Test
	void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);
		
		Product product = new Product();
		product.setId(1L);
		product.setName("Mac");
		product.setDescription("awesome");
		product.setPrice(1200d);
		
//		repository.save(product);
		
//		Optional<Product> optionalProduct = repository.findById(1L);
//		if(optionalProduct.isPresent())
//		{
//			Product result = optionalProduct.get();
//			System.out.println("result is: " + result);
//			result.setPrice(1500d);
//			repository.save(result);
//			repository.findAll().forEach(p->{System.out.println(p.getPrice());});
//		}
		
		System.out.println(repository.findByName("Mac"));
		System.out.println(repository.findByPrice(1500d));
		
		System.out.println(repository.findByNameAndPrice("Mac", 1500d));
		}

}
