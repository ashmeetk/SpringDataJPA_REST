package com.ashmeet.spring.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashmeet.spring.data.springdatajpa.entities.Product;
import com.ashmeet.spring.data.springdatajpa.repos.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepository repository;
	
	@GetMapping
	public Iterable<Product> getProducts()
	{
		return repository.findAll();
	}
	
	@PutMapping
	public Product update(@RequestBody Product product)
	{
		return repository.save(product);
	}
	
	@PostMapping
	public Product create(@RequestBody Product product)
	{
		return repository.save(product);
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Long id)
	{
		Optional<Product> opProduct = repository.findById(id);
		if(opProduct.isPresent())
			return opProduct.get();
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable("id") Long id)
	{
		repository.deleteById(id);
	}
	
}
