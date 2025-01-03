package com.davidmartins.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidmartins.workshopmongo.domain.Post;
import com.davidmartins.workshopmongo.repository.PostRepository;
import com.davidmartins.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	public Object findById(String id) {
		Optional<Post> user = repo.findById(id);
		if (user == null) {
		      throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;
	}
	
	public List<Post> findByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);
		
	}
}
	
	