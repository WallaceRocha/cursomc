package com.wall.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wall.cursomc.domain.Categoria;
import com.wall.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	}
}
