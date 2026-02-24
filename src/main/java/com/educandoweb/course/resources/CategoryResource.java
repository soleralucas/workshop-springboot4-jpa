package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> list = service.findAll(); 
		
		//representa a respota HTTP completa
		return ResponseEntity.ok().body(list); //retorna/define o corpo que será enviado na respota
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById( @PathVariable Long id){ //considera o id como parametro que vai chegar na URL
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
