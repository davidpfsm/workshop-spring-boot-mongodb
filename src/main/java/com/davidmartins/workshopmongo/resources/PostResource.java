package com.davidmartins.workshopmongo.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidmartins.workshopmongo.domain.Post;
import com.davidmartins.workshopmongo.services.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostResource {
	
	@Autowired
	private PostService service;
	
	
	@GetMapping
	public ResponseEntity<Post> findById(@PathVariable String id){
		Post obj = (Post) service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}